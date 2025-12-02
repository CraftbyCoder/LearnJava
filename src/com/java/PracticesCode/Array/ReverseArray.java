package com.java.PracticesCode.Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // reverse using the while
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length value of an array");
        int l = sc.nextInt();
        int  []arr = new int[l];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // using while loop
//        int i=0;
//        int j = arr.length-1;
//        System.out.println("Original value in array : "+ Arrays.toString(arr));
//        while (i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println("Reverse value in array : "+ Arrays.toString(arr));
//        sc.close();
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }


}
