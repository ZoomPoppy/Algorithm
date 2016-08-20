package com.zz.homework.面试题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 网易有道面试题：
 * 按照下面的算法计算一队列数：
 *    先将队列头部的数据放到队尾，然后再弹出对头的数输出；
 *    得到从1到n的 输出，求原来的队列
 *
 * Created by zz on 2016-08-14.
 *
 */
public class Main {
    private static ArrayList<LinkedList<Integer>> a = new ArrayList<>();
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        for (int i = 0; i < sum; i++){
            int i1 = scanner.nextInt();
            a.add(print(i1));
        }
        for (int i = 0; i< sum; i++){
            System.out.println(a.get(i));
        }
    }

    public static LinkedList print(int n){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(n);
        queue.offer(n-1);
        for (int i = n-2; i > 0; i--){
            Integer last = queue.peekLast();
            queue.add(0,last);
            queue.removeLast();
            queue.add(1,i);
        }
        return  queue;
    }
}
