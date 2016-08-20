package com.zz.homework.chapter_2.practice;

/**
 * 自然归并排序
 * Created by zz on 2016-08-20.
 */
public class Main_2_2_15 {
    private static Comparable[] aux;
    private static int[] index;

    public static void main(String args[]){
        Integer[] a = new Integer[]{3,2,4,3,4,5,2,3,4,5,1,4,1,2,3,4,1};
        sort(a);
    }


    public static void sort(Comparable[] a){
        int k = pass(a);
        aux = new Comparable[a.length];
        while (k != 1){
            for (int i = 0; i < k; i = i + 2){
                merge(a, index[i], index[i+1] - 1, index[i+2] - 1);
            }
            k = pass(a);
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int N = a.length;
        for (int i = 0; i < N; i++){
            aux[i] = a[i];
        }
        int k = lo;
        int j = mid + 1;
        for (int i = lo; i <= hi; i++){
            if (k > mid) a[i] = aux[j++];
            else if (j > hi)   a[i] = aux[i++];
            else if (less(aux[k], aux[j])) a[i] = aux[k++];
            else  a[i] = aux[j++];
        }
    }

    /**
     * 扫描一遍数组找出所有已经排好序的元素的起始位置
     * 示例： 32434523451412341
     *  分为这些 3 24 345 2345 14 1234 1 已经排序的数组，然后再进行一般的归并
     */
    public static int pass(Comparable[] a){
        index = new int[a.length];
        int k = 0;
        index[k++] = 0;
        Comparable begin = a[0];
        for (int i = 1; i < a.length; i++){
            if (less(a[i],begin))
                index[k++] = i;
            begin = a[i];
        }
        /**
         *  index[k++] = a.length;
         *  这条代码的作用是再进行merge的时候，需要提供lo，mid，hi 三个元素，
         *  这三个元素是通过需要排序的数组的下表i来进行判断的
         *  假设现在是第i个数组和第i+1 个数组进行排序
         *  那么 index[i] 就是第i个数组的开始下标也就是lo
         *  index[i+1] -1 就是第i个数组的最后一个 也就是 mid
         *  index[i+2] -1 就是第i+1 个数组的最后一个 也就是 hi ，而假设是倒数第二个数组和倒数第一个数组进行merge
         *  那么index[i+2]就会是0，但是我们需要的是最后一个元素的下标，所以给index中的最后一个元素设置为数组最末的下标
         */
        index[k++] = a.length;
        return k;

    }

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) ==  -1;
    }
}
