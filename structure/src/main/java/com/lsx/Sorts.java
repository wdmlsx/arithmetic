package com.lsx;

import com.lsx.sort1106.SortEnum;

import java.util.Arrays;

public class Sorts {
    public static void main(String[] args) {
        SortEnum[] sorts = SortEnum.values();
        for (SortEnum sort : sorts) {
            int[] arr = {3,2,35,6,876,322,23,100,0,9};
            System.out.println(Arrays.toString(arr)+"-->"+"beforeSort");
            int[] newArr = sort.sort(arr);
            System.out.println(Arrays.toString(newArr)+"-->"+sort.getSortName());
            System.out.println();
            System.out.println();
        }
    }
}
