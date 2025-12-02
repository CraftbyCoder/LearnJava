package com.javaLearning.conditionandstatements;

import java.util.Scanner;

public class PrintTheLargestNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
        if((num1 > num2)&&(num1 > num3)) {
            System.out.println("Number 1 is the largest number = "+num1);
        }
        else if((num1 ==  num2)&&(num2 == num3) &&(num1 == num3)) {
            System.out.println("All Number's are equal to each others : "+num1+" == "+num2+" == "+num3);

        }
        else if(num2 > num3) {
            System.out.println("Number 2 is the largest number = "+num2);
        }
        else {
            System.out.println("Number 3 is the largest number = "+num3);
        }
        scan.close();

    }

}
