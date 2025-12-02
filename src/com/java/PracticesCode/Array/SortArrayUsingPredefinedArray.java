package com.java.PracticesCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingPredefinedArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int num = sc.nextInt();
        int [] arr = new int[num];
        // read
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sort array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sort array: "+ Arrays.toString(arr));



    }
}
