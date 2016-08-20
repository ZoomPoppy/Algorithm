package com.zz.homework.chapter_2.Example;

/**
 * Created by zz on 2016-08-16.
 */
public class Merge {


    //自顶向上
    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = (hi - lo) / 2 + lo;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    //利用另外的一个数组来进行归并排序
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        Comparable[] aux = new Comparable[a.length];
        int j = mid + 1;
        int k = lo;
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        for (int i = 0; i <= hi; i++) {
            if (k > mid) a[i] = aux[j++];
            else if (j > hi) a[i] = aux[k++];
            else if (less(aux[k], aux[j])) a[i] = aux[k++];
            else a[i] = aux[j++];
        }
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) == -1;
    }

}
