package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-02.
 */
public class Main_1_1_5 {
    public static void main(String args[]){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        if (((x-1) > 0) && ((y-1) > 0)){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
