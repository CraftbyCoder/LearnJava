package com.java.PracticesCode.Array;

import java.util.Scanner;

public class CountLargerNumber {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leng = scan.nextInt();
        System.out.println("Enter the length of an array "+leng);
        int [] arr = new int[leng];
//        declare
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int count =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        System.out.println("Larger Number in array are "+count);
    }
}
