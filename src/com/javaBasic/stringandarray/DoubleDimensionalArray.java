package com.javaBasic.stringandarray;

import java.util.Scanner;

public class DoubleDimensionalArray {

    public static void main(String[] args) {
        // First Declaration
        int [] a[] = new int [2][2];
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        System.out.println("First type of decelaration ");
        System.out.println("Array [0][0] "+a[0][0]);
        System.out.println("Array [0][1] "+a[0][1]);
        System.out.println("Array [1][0] "+a[1][0]);
        System.out.println("Array [1][1] "+a[1][1]);
        // second declaration
        System.out.println("second type of decelaration ");
        int [] [] arr = {{400,500},{600,700}};
        System.out.println("Array [0][0] "+arr[0][0]);
        System.out.println("Array [0][1] "+arr[0][1]);
        System.out.println("Array [1][0] "+arr[1][0]);
        System.out.println("Array [1][1] "+arr[1][1]);
        // third type of declaration
        System.out.println("Enter the number of array lenght!!");
        Scanner scan = new Scanner(System.in);
        int sc=scan.nextInt();
        // declare the array
        int [][] array =new int [sc][sc] ;
        for(int i=0;i<sc;i++) {
            for(int j=0;j<sc;j++) {
                array[i][j]=scan.nextInt();

            }
            // basic way to displayed the for loop
        }
        for(int i=0;i<sc;i++) {
            for(int j=0;j<sc;j++) {
                System.out.println("array [ "+i +"]"+"["+j+"]"+ array[i][j]);
            }
        }
        // enhanced for loop / for each loop
        System.out.println("Enhanced for loop / for each loop");
        for(int[] each : array){
            for(int num:each){
                System.out.print(num +" ");
            }
        }
        scan.close();
    }



}
