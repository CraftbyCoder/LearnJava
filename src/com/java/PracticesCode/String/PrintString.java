package com.java.PracticesCode.String;

import java.util.Scanner;

public class PrintString {
/*
* Total number of characters

Convert to uppercase

Print character at index 3

Check if string contains “Dharshini” *
*/
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scan.nextLine();
        char [] nameArr = name.toCharArray();
        int count = 0;
//        * Total number of characters
        for(int i=0;i<nameArr.length;i++){
            count++;
        }
        System.out.println("Total number of characters: "+count);
//        Convert to uppercase
        String upperName = name.toUpperCase();
        System.out.println("Upper Case Name: "+upperName);
// Print character at index 3
        System.out.println(nameArr[3]);
//       Check if string contains “Dharshini”
if(name.contains("Dharshini")){
    System.out.println("The String contain Dharshini");
}else{
    System.out.println("The String is not contain Dharshini");

}

scan.close();
    }
}
