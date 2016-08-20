package com.zz.homework.other;

/**
 * Created by zz on 2016-08-03.
 */

/**
 * java中
 */
public class Main {

    private String test = "nihao";

    private char[] chars = new char[]{'a','b','c'};

    public static void main(String args[]){
        Main main = new Main();
        main.change(main.test,main.chars);
        System.out.println(main.test);
        System.out.println(main.chars);
    }

    private  void change(String str, char[] chars){
        str = "wobuhao";
        chars[0] = 'b';
    }
}
