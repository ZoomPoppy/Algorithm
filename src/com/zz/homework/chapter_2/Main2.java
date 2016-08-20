package com.zz.homework.chapter_2;

import java.util.Scanner;

/**
 * Created by zz on 2016-08-17.
 * 网易有道面试题：
 * 扑克牌洗牌问题， 如果最开始是1 2 3 4 5 6  那么分为连扳 123 456 从右边的最后取一张
 * 放到最底下，然后从左边的最后去一张 放到底下，一次完成之后是     142536，然后继续下一轮
 */
public class Main2 {
    public static int[] temp;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        for (int i = 0; i< sum; i++){
            int num = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[2*num];
            for (int j = 0; j < 2*num; j++){
                a[j] = scanner.nextInt();
            }
            print(a,k);
        }
    }

    public static void print(int[] num, int k){
        int n_2 = num.length;
        int n = n_2/2;
        temp = new int[n_2];
        for (int j = 0; j < k; j++){
            for (int i = 0; i < n_2;){
                temp[i] = num[i/2];
                temp[i+1] = num[n+(i/2)];
                i = i + 2;
            }
            int[] temp1 = temp;
            temp = num;
            num = temp1;

        }
        for (int i = 0; i < n_2; i++){
            System.out.println(num[i]);
        }
    }
}
