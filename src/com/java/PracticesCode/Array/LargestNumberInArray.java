package com.java.PracticesCode.Array;

public class LargestNumberInArray {
    public static void main(String[] args){
        int[] a ={1,89,56,2,5};
        for (int i=0;i<a.length;i++){
            if(a[i]>a[i+1]){
                System.out.println("The max number in the array is : "+a[i]);
                break;
            }
        }
    }
}
