package com.javaLearning.stringandarray;

import java.util.Scanner;

public class StringPrint {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i=0;i<=name.length();i++) {
            System.out.println("Name : "+i + " = "+name);
        }
        scan.close();

    }

}
