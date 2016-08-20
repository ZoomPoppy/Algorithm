package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-02.
 */
public class Main_1_1_3 {

    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a==b&&a==c){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
