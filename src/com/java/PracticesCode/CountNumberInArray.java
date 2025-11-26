package com.java.PracticesCode;

import java.util.Scanner;

public class CountNumberInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an Array");
        int len = sc.nextInt();
        int [] a = new int [len];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int count =0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2 ==0){
                count = count +1;
            }
        }
        System.out.println("The Total even number present in array are : "+count);
        sc.close();
    }
}
