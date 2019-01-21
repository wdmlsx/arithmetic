package com.lsx.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:  java类作用描述
 * @Author:  wdming
 * @CreateDate:  2018/11/5 0:16
 * @Version:  1.0
 *
 * 通过测试可以看出来一个有序数组在查询方面有着很快的素的
 * 但是在插入和删除方面效率都不是很高
 * 其中在删除方面和无序数组一样，除了在元素定位上比较快意外，都需要对后面元素进行移动
 */
public class OrderArrayTest {

    private OrderArray oa;

    @Before
    public void init() {
        oa = new OrderArray(1000);
    }
    @Test
    public void insert() throws Exception {
        oa.insert(2);
        oa.insert(1);
        oa.insert(5);
        oa.insert(8);
        oa.insert(3);
        oa.insert(0);
        oa.insert(7);
        oa.insert(4);
        oa.insert(6);
        oa.display();
        System.out.println("--------------------");
        int index = oa.find(2);
        System.out.println(index);
    }

    @Test
    public void find() throws Exception {
        for(int i=1;i<=100;i++) {
            oa.insert(i);
        }
        int index = oa.find(100);
        System.out.println(index);
    }

    @Test
    public void display() throws Exception {
    }

}