package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-03.
 */
public class Main_1_1_11 {

    public static void main(String args[]){
        boolean[][] booleen = randowBooleen(5, 5);
        System.out.println("  01234");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j<5; j++){
                if (j == 0) System.out.print(i+" ");
                if (booleen[i][j]){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static boolean[][] randowBooleen(int row, int column){
        boolean[][] booleen = new boolean[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j <column; j++){
                double sum = Math.random();
//                System.out.println(sum);
                booleen[i][j] = ((sum-0.5) > 0);
            }
        }
        return booleen;
    }
}
