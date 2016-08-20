package com.zz.homework.chapter_2.Example;

/**
 * Created by zz on 2016-08-17.
 * 归并排序 自底向上
 */
public class MergeBU {

    public static Comparable[] aux ;

    public static void main(String args[]){
        Integer[] a = new Integer[]{5,4,3,2,1};
        sort(a);
    }

    public static void print(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < a.length; i++){
            Integer m = (Integer) a[i];
            System.out.print(m.intValue());
        }
        System.out.println("");
    }

    public static void sort(Comparable[] a){
        int N = a.length;
        aux = new Comparable[N];
        for (int size = 1; size < N; size = size * 2){
            for (int lo = 0; lo < N; lo = lo + size * 2){
                int hi = Math.min(lo + size * 2 -1,N-1);
                int mid = lo + size -1;
                merge(a, lo, mid, hi);
                print(a);
            }
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int j = mid + 1;
        int k = lo;
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        for (int i = lo; i <= hi; i++) {
            if (k > mid)                     a[i] = aux[j++];
            else if (j > hi)                 a[i] = aux[k++];
            else if (less(aux[k], aux[j]))   a[i] = aux[k++];
            else                             a[i] = aux[j++];
        }
    }
    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) == -1;
    }
}
