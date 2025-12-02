package com.javaLearning.conditionandstatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2==0) {
            System.out.println("The Given number is Even = "+number);
        }
        else {
            System.out.println("The Given number is Odd = "+number);

        }
        scan.close();
    }

}
