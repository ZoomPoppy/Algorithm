package com.zz.homework.chapter_2.Example;

/**
 * Created by zz on 2016-08-15.
 */
public class Shell {

   public static void sort(Comparable[] a){
      int N = a.length;
      int h = 1;
      while (h <= N/3){
         h = h*3 + 1;
      }
      for (int i = h; i < N; i++){
         for (int j = i; j > h && less(a[j],a[j-h]); j = j - h){
            Comparable temp = a[j-h];
            a[j-h] = a[j];
            a[j] = temp;
         }
         h = h/3;
      }
   }
   public static boolean less(Comparable a, Comparable b){
      return a.compareTo(b) == -1;
   }

}
