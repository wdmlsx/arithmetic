package com.lsx.array.array1105;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderArrayTest {
    @Test
    public void find() throws Exception {
        for(int i=0;i<=99;i++) {
            oa.insert2(i);
        }
        int index = oa.find(49);
        System.out.println(index);
    }

    private OrderArray oa;

    @Before
    public void init() {
        oa = new OrderArray(1000);
    }
    @Test
    public void insert() throws Exception {
        oa.insert2(3);
        oa.insert2(4);
        oa.insert2(7);
        oa.insert2(1);
        oa.insert2(2);
        oa.insert2(9);
        oa.insert2(8);
        oa.insert2(6);
        oa.insert2(5);
        oa.display();
    }

    @Test
    public void insert2() throws Exception {
        oa.insert2(3);
        oa.insert2(4);
        oa.insert2(7);
        oa.insert2(1);
        oa.insert2(2);
        oa.insert2(9);
        oa.insert2(8);
        oa.insert2(6);
        oa.insert2(5);
        oa.display();
    }

}