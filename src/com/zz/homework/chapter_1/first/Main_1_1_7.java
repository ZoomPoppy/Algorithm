package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-02.
 */
public class Main_1_1_7 {
    public static void main(String args[]){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.01){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t);

        int sum = 0;
        for (int i = 2; i < 1000; i++){
            for (int j = 0; j < i; j++){
                sum++;
            }
        }
        System.out.println(sum);

        int sum_2 = 0;
        for (int i = 1; i < 1000; i*=2){
            for (int j = 0; j < 1000; j++){
                sum_2++;
            }
        }
        System.out.println(sum_2);
    }
}
