package com.java.PracticesCode.String;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String name = "priya dharshini";
        char [] ch = name.toCharArray();
        String reverse =" ";
        for(int i=ch.length-1;i>=0;i--){
            reverse = reverse+ch[i];
        }
        System.out.println(reverse);
    }
}
