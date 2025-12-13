package com.java.PracticesCode.String;

import java.util.Scanner;

public class CountTheVowelsInString {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = scan.nextLine();
        String upper = name.toUpperCase();
        System.out.println("After change to uppercase "+upper);
        char [] charName = upper.toCharArray();
        int count = 0;
        for(int i=0;i<charName.length;i++){
            if((charName[i] == 'A' )|| (charName[i] == 'U')|| (charName[i] == 'I')|| (charName[i] == 'O')){
                count++;
            }
        }
        System.out.println("The Vowels Present in the String are : "+count);

    }
}
