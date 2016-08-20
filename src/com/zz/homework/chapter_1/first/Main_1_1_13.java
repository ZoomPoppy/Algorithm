package com.zz.homework.chapter_1.first;

/**
 * Created by zz on 2016-08-03.
 */
public class Main_1_1_13 {
    public static void main(String args[]){
        int[][] matrix = randomIntMatrix(5, 5);
        

    }

    private static int[][] randomIntMatrix(int row, int column){
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                int random = (int) (Math.random()*100000);
                matrix[i][j] = random;
            }
        }
        return matrix;
    }

}
