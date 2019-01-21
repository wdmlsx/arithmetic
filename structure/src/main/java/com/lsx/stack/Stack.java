package com.lsx.stack;

public class Stack {
    private int top;//标记栈内存中第一个元素的指针
    private int size;//栈内存最大容纳的元素个数
    private int length;//栈内存的实际元素个数
    private char[] stackArray;

    public Stack(int size) {
        stackArray = new char[size];
        top = -1;
        length = 0;//
        this.size = size;
    }

    //压栈，将元素存入栈内存中
    public void push(char ele) {
        if (isFull()) {
            System.out.println("内存已满，无法进行添加操作！");
            return;
        } else {
            stackArray[++top] = ele;
            length++;
        }
    }

    //弹栈，将栈中的最后一个添加的元素取出
    public char pop() {
        if (isEmpty()) {
            System.out.println("栈中暂无数据！");
        }
        length--;
        return stackArray[top--];
    }

    //查看栈顶元素
    public char peek() {
        if (isEmpty()) {
            System.out.println("栈中暂无数据！");
            return ' ';
        }
        return stackArray[top];
    }

    //判断栈是不是空的
    public boolean isEmpty() {
        return length == 0;
    }

    //判断栈内存是否已满
    public boolean isFull() {
        return (length == size);
    }

}
