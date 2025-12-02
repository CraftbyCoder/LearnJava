package com.java.PracticesCode.Array;

import java.util.Scanner;

public class DuplicateNumberInGivenArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to verify in the array");
        int num = sc.nextInt();
        System.out.println("To verify the count in array: "+num);
        System.out.println("Enter the length of an array");
        int l =sc.nextInt();
        int [] a = new int[l];
        // store the array data or read the array data
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        // check the duplicate array
        int count =0;
        boolean status = false;
        for(int i=0;i<a.length;i++){
            if(num == a[i]){
                count += 1;
                status = true;
            }
        }
        if(status == false){
            System.out.println("Dont have any duplicate number in the given array");
        }else {
            System.out.println("The duplicate number of the array is: "+count);
        }
    }
}
