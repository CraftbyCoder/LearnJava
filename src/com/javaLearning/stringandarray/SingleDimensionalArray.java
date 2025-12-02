package com.javaLearning.stringandarray;

import java.util.Scanner;

public class SingleDimensionalArray {



    public static void main(String[] args) {
        // one type of declare
        System.out.println("First type of Declaration");
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
        System.out.println("Array 1 " + a[0]);
        System.out.println("Array 2 " + a[1]);
        System.out.println("Array 3 " + a[2]);
        System.out.println("Array 4 " + a[3]);
        System.out.println("Array 5 " + a[4]);
        System.out.println("Second type of Declaration");

        // second type of declare
        int arr[] = {200, 400, 600};
        System.out.println("Array 1 " + arr[0]);
        System.out.println("Array 2 " + arr[1]);
        System.out.println("Array 3 " + arr[2]);
        System.out.println("Third type of Declaration");

        // thrid declare by the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int array[] = new int[number];
        // getting the number add into the array
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        // display the entered array
        for (int i = 0; i < number; i++) {
            System.out.println("Array value : " + array[i] + ",");
        }
        sc.close();
        // enchanced for loop
        System.out.println("Enhaced for loop / for each loop");
        for(int num :array){
            System.out.println(num+ " ");
        }
    }

}
