package com.javaLearning.loop;


import java.util.Scanner;

/**
 *
 */
public class PrintNameUsingFor {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int length = name.length();
        for(int i =0;i<=length;i++) {
            System.out.println("Name: "+i+": "+name);
        }
        scan.close();

    }


}
