package com.lsx.array;

/**
 * @Description: java类作用描述
 * @Author: wdming
 * @CreateDate: 2018/11/4 22:02
 * @Version: 1.0
 */
public class OrderArray {
    int[] orderArray;
    int length;//数组元素个数

    public OrderArray(int max) {
        orderArray = new int[max];
        length = 0;
    }

    //添加元素
    public void insert(int ele) {
        if (length == 0) {
            orderArray[length++] = ele;
        } else {
            int i = 0;
            while (i < length && orderArray[i] < ele) {
                i++;
            }
            for (int j =length-1; j>=i; j--) {
                orderArray[j + 1] = orderArray[j];
            }
            orderArray[i] = ele;
            length++;
        }
    }

    //查找元素（使用二分法查找）
    public int find(int ele) {
        //int midIndex = length/2;
        int index = -1;
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int midIndex = (low + high) / 2;
            if (orderArray[midIndex] == ele) {
                index = midIndex;
                break;
            } else if (orderArray[midIndex] > ele) {
                high = midIndex - 1;
            } else {
                low = midIndex + 1;
            }
            System.out.println("[" + low + " " + high + "]");
        }
        return index;
    }

    //删除某个特定的元素，删除成功则返回true失败返回false
    public boolean delete(int ele) {
        int index = -1;
        if ((index = find(ele)) != -1) {
            for(;index<length-1;index++) {
                orderArray[index] = orderArray[index + 1];
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
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for(int i=0;i<length-1;i++) {
                sb.append(orderArray[i] + ",");
            }
            sb.append(orderArray[length - 1]+"]");
            str = sb.toString();
        }
        System.out.println(str);
    }
}
