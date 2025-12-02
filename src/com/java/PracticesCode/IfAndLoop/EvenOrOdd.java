package com.java.PracticesCode.IfAndLoop;

public class EvenOrOdd {
    public static void main(String args []){
        int even =0, odd =0;
        for(int i=1;i<=100;i++) {
            if (i % 2 == 0) {
                even += 1;
            } else {
                odd += 1;

            }
        }
        System.out.println("Even number in between 1 to 100 = "+even);
        System.out.println("Odd number in between 1 to 100 = "+odd);
    }

}
