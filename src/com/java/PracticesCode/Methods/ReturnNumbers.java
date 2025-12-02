package com.java.PracticesCode.Methods;

public class ReturnNumbers {
    static void main(String[] args) {
        System.out.println("Main Method Start");
        int a=10, b =20;
        int total = number(a,b);
        System.out.println("total value: "+total);
        System.out.println("Main Method end");
    }
    public static int number(int a,int b){
    System.out.println("Method Start");
    int res = a +b;
    System.out.println("Method end");
    return res;

    }
}
