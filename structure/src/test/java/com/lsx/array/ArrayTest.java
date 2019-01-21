package com.lsx.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:  java类作用描述
 * @Author:  wdming
 * @CreateDate:  2018/11/4 21:56
 * @Version:  1.0
 *
 * 针对Array的测试发现
 * 无序数组（元素插入的时候，是直接插入的，没有进行元素间大小的比较)
 * 无序数组的特点：
 *      插入块（直接插入就好）
 *      查找慢（往往需要对数组元素进行遍历比较因此查找起来比较麻烦
 */
public class ArrayTest {

    private Array array;
    @Before
    public void init() {
        array = new Array(10);
    }
    @Test
    public void contains() throws Exception {
        int index = array.contains("ele");
        System.out.println(index);
    }

    @Test
    public void insert() throws Exception {
        String elem = "elem";
        array.insert(elem);
        int i = array.contains(elem);
        System.out.println(i);
    }

    @Test
    public void delete() throws Exception {
        array.insert("elem1");
        array.insert("elem2");
        array.insert("elem3");
        array.insert("elem4");
        array.display();
        array.delete("elem1");
        array.display();
    }

    @Test
    public void display() throws Exception {
    }

}