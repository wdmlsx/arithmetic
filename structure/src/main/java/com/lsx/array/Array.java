package com.lsx.array;

/**
 * @Description: java类作用描述
 * @Author: wdming
 * @CreateDate: 2018/11/4 21:13
 * @Version: 1.0
 * <p>
 * 数组是应用最广泛的一种数据结构，常常被植入到编程语言中
 * 植入到编程语言中，作为基本数据类型使用
 * 其实数组就是一段连续的内存，
 * 即使在物理内存中不是连续的，在逻辑上肯定是连续的
 * <p>
 * 数据结构不仅是数据的容器，还要提供对数据的操作方法
 * 比如检索、插入、删除、排序等
 * <p>
 * <p>
 * 下面的这个类，对数据检索、插入、删除、打印操作进行封装
 * 假设数组中没有重复的值（实际上数据可以包含重复值）
 */
public class Array {
    private String[] strArray;
    private int length;//数组元素的个数

    public Array(int max) {
        strArray = new String[max];
        length = 0;
    }

    //检测数据是否包含某个元素，如果存在返回其下标，不存在则返回-1
    public int contains(String ele) {
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (strArray[i].equals(ele)) {
                index = i;
            }
        }
        return index;
    }

    //插入
    public void insert(String ele) {
        strArray[length++] = ele;
    }

    //删除某个指定的元素，删除成功则返回true失败返回false
    public boolean delete(String ele) {
        int index = -1;
        if ((index = contains(ele)) != -1) {
            for (int i = index; i < length - 1; i++) {
                strArray[i] = strArray[i + 1];
            }
            length--;
        } else {
            return false;
        }
        return true;
    }

    //列出所有元素
    public void display() {
        String str = "";
        if (length == 0) {
            str = "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < length - 1; i++) {
                sb.append(strArray[i] + ",");
            }
            sb.append(strArray[length - 1]+"]");
            str = sb.toString();
        }
        System.out.println(str);
    }
}
