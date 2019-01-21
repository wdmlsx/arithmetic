package com.lsx.queue;

public class PriorityQueue {
    private int maxSize;
    private int length;
    private int first;
    private int last;
    private int[] intArray;
    private int referencePoint;

    public PriorityQueue(int maxSize,int referencePoint) {
        this.maxSize = maxSize;
        this.referencePoint = referencePoint;
        intArray = new int[maxSize];
        length = 0;
        first = -1;
        last = -1;
    }

    public void insert(int ele) {
        if (isFull()) {

        }else{
            int len = length -1;
            int ab_insert = Math.abs(ele - referencePoint);
            while (len >= 0 && Math.abs(intArray[len] - referencePoint) >= ab_insert) {
                intArray[len + 1] = intArray[len--];
            }
            intArray[len + 1] = ele;
            length++;
        }
    }

    public int remove(int ele) {

        return first++;
    }

    public boolean isFull() {
        return length==maxSize;
    }

    public boolean isEmpty() {
        return length == 0;
    }

}
