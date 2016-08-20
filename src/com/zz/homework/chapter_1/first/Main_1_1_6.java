package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-02.
 */
public class Main_1_1_6 {

    /**
     * f = f + g; g = f - g;
     * 上面这一段可以看成
     * 新的f等于f加上g 然后将 g 等于 f 的前一个值
     *
     * @param args
     */
    public static void main(String args[]){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
