package com.lsx.queue;

public class Queue {
    private int maxSize;
    private int top;
    private int eare;
    private int length;
    private int[] queArray;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        eare = 0;
        length=0;
        queArray = new int[maxSize];
    }


    public void insert(int ele) {
        if (isFull()) {
            return;
        }else {
            if(top==maxSize-1){
                top=-1;
            }
            queArray[++top]=ele;
            length++;
        }
    }

    public int remove() {
        if (isEmpty()) {

        }
        if (eare == maxSize) {
            eare = 0;
        }
        length--;
        return queArray[eare++];
    }


    public boolean isEmpty() {
        return length==0;
    }

    public boolean isFull() {
        return (maxSize==length);
    }
}
