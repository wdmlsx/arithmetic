package com.lsx.array.array1105;

public class OrderArray {
    private int length;
    private int maxSize;
    private int[] intArray;

    public OrderArray(int maxSize) {
        this.maxSize = maxSize;
        intArray = new int[maxSize];
        length = 0;
    }

    public void insert(int ele) {
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (intArray[i] >= ele) {
                index = i;
            }
        }
        for (int j = length - 1; j >= index; j--) {
            intArray[j + 1] = intArray[j];
        }
        intArray[index] = ele;
    }

    public void insert2(int ele) {
        int len = length - 1;
        while (len >= 0 && intArray[len] >= ele) {
            intArray[len + 1] = intArray[len--];
        }
        intArray[len + 1] = ele;
        length++;
    }

    public int find(int ele) {
        int index = -1;
        int low = 0;
        int high = length - 1;
        int count = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid="+mid+"["+low+" "+high+"]");
            count++;
            if (intArray[mid] == ele) {
                index = mid;
                break;
            } else if (intArray[mid] > ele) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("count="+count);
        return index;
    }

    public void display() {
        String str = "";
        if (length == 0) {
            str = "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < length - 1; i++) {
                sb.append(intArray[i] + ",");
            }
            sb.append(intArray[length - 1] + "]");
            str = sb.toString();
        }
        System.out.println(str);
    }
}
