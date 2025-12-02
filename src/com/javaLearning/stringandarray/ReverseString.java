package com.javaLearning.stringandarray;


import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(), reverse = "";
        for (int i = 0;i< name.length();i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println("Reverse String = "+reverse);
        scan.close();
    }

}

