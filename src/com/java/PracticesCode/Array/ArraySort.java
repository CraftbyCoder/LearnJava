package com.java.PracticesCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<=arr.length;i++){
            System.out.println("Enter the index of "+i +"value: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[j]=arr[i];
                    arr[i] = arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
