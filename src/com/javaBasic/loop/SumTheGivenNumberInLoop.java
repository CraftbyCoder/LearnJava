package com.javaBasic.loop;

import java.util.Scanner;

public class SumTheGivenNumberInLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), sum = 0;
        for(int i = 0;i<=num;i++) {
            sum = sum + i;
        }
        System.out.println("sum of the numbers in the loops = "+sum);
        scan.close();
    }

}

