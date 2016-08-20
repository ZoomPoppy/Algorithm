package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-03.
 */
public class Main_1_1_9 {

    public static void main(String args[]){
        String s = intToBinaryString(9);
        System.out.println(s);
    }

    private static String intToBinaryString(int n){
        String binaryString = "";
        for (int i = n; i > 0; i /= 2){
            binaryString = ( i % 2) + binaryString;
        }
        return binaryString;
    }
}
