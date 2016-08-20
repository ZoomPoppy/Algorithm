package com.zz.homework.chapter_2.Example;

/**
 * 插入排序
 * 从第i个元素开始向前比较，如果比前面的元素小，那么交换。
 * 示例：一轮
 * 012564 前5个元素已经整理完成
 * 然后就是 012546
 *         012456
 *         然后完成比较
 * 插入排序对以下三种数组比较好：
 *     数组中的每个元素离他最终的位置不远
 *     一个有序的大数组接上一个小数组
 *     数组中只有几个元素的位置不对
 * 插入排序需要的交换操作和数组中倒置的数量相同，需要比较的次数大于等于倒置的数量
 * 小于等于倒置的数量加上数组的大小再减一
 *    证明：每次交换都改变了两个顺序颠倒元素的位置，相当于减少了一对倒置，
 *    当倒置的数量为0时，排序也就完成了。
 *    每次交换都对应着一次比较，且1到N-1 之间的每个i 都可能需要一次额外的比较
 *
 * 提高插入排序的速度，可以再内循环中将较大的元素都向右移动，而不总是交换两个元素，
 * 这样访问数组的次数就能减半。
 * Created by zz on 2016-08-14.
 */
public class Insertion {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 1; i < N; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                Comparable temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
        }
    }

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) == -1;
    }

}
