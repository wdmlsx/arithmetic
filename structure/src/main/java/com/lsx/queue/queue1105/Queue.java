package com.lsx.queue.queue1105;

public class Queue {
    private int maxSize;
    private int length;
    private int top;//标记队列头部
    private int eare;//标记队列尾部
    private String[] strArray;
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        strArray = new String[maxSize];
        length=0;
        top = 0;
        eare = -1;
    }

    public void insert(String ele) {
        if (isFull()) {

        } else {
            if (eare == maxSize-1) {
                eare = -1;
            }
            strArray[++eare] = ele;
            length++;
        }
    }

    public void delete(String ele) {
        if (isEmpty()) {

        } else {
            if (top == maxSize) {
                top = 0;
            }
            length--;
        }
    }

    public boolean isFull() {
        return length==maxSize;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
