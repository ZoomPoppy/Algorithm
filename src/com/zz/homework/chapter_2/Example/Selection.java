package com.zz.homework.chapter_2.Example;

/**
 * 最简单的选择排序
 * N个元素的数组，需要交换N次，以及比较N^2/2次
 * 第0个元素比较N-1次，依次减少 总共(N-1)+(N-2)+...+2+1;
 * Created by zz on 2016-08-14.
 */
public class Selection {
    public static void sort(Comparable[] a){
        //将a按照升序排列
        int N = a.length;
        for (int i = 0; i< N; i++){
            int min = i;
            //找到从i到N个元素中最小元素的标号
            for (int j = i + 1; j < N; j++){
                if (a[j].compareTo(a[min]) == -1){
                    min = j;
                }
                //交换
                Comparable temp = a[i];
                a[i] = a[min];
                a[min]  = temp;
            }
        }
    }
}
