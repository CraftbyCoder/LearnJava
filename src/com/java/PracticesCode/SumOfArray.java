package com.java.PracticesCode;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int [] a = new int[length];
        System.out.println("Enter the value in Array");
        // to store the array
        for (int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();

        }
        //sum of array
        int sum  =0;
        for (int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of the Array = "+sum);
        sc.close();
    }
}
