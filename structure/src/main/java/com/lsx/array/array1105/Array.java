package com.lsx.array.array1105;

public class Array {
    private int maxSize;
    private int length;
    private int[] intArray;
    public Array(int maxSize) {
        this.maxSize = maxSize;
        length = 0;
        intArray = new int[maxSize];
    }

    public void insert(int ele) {
        intArray[length++] = ele;
    }

    public int contains(int ele) {
        int index = -1;
        for(int i=0;i<length;i++) {
            if (intArray[i] == ele) {
                index=i;
                break;
            }
        }
        return index;
    }

    public boolean delete(int ele) {
        int index = -1;
        if ((index = contains(ele)) != -1) {
            for (; index < length - 1; index++) {
                intArray[index] = intArray[index + 1];
            }
            length--;
        } else {
            return false;
        }
        return true;
    }
}
