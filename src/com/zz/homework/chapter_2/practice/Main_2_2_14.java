package com.zz.homework.chapter_2.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 归并有序队列
 * 将两个有序队列作为参数，返回一个归并后的有序队列
 * Created by zz on 2016-08-20.
 */
public class Main_2_2_14 {



    public static void main(String args[]){
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            integers.offer((int) (Math.random() * 10));
            integers1.offer((int) (Math.random() * 10));
        }

        Queue queue = mergeQueue(integers, integers1);
        print(queue);

    }

    public static void print(Queue a){
        int N = a.size();
        for (int i = 0; i < N; i++){
            System.out.print(a.poll());
        }
        System.out.println("");
    }

    public static  <T extends Comparable>  Queue mergeQueue(Queue<T> a, Queue<T> b){
        int N = a.size() + b.size();

        Queue<T> outQueue = new LinkedList<T>();

        for (int i = 0; i < N; i++){
            if (a.isEmpty()) outQueue.offer(b.poll());
            else if (b.isEmpty()) outQueue.offer(a.poll());
            else outQueue.offer(getMinElement(a, b));
        }
        return outQueue;
    }

    public static <T extends Comparable> T getMinElement(Queue<T> a, Queue<T> b) {
        if (a.peek().compareTo(b.peek()) == -1)
            return a.poll();
        if (a.peek().compareTo(b.peek()) ==  0)
            return a.poll();
        else
            return b.poll();
    }

}
