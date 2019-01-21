package com.lsx.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {

    private Stack s;

    @Before
    public void init() {
        s = new Stack(100);
    }
    @Test
    public void push() throws Exception {
        s.push('A');
        s.push('F');
        s.push('D');
        s.push('C');
        s.push('B');
        s.push('E');
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    @Test
    public void pop() throws Exception {
    }

    @Test
    public void peek() throws Exception {
    }

}