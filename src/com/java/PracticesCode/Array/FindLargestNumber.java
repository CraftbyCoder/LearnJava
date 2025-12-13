package com.java.PracticesCode.Array;

import java.util.Scanner;

public class FindLargestNumber {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int [] arr = new int[len];
//        declare
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
//      check max
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Large number in array " +max);

    }
}
