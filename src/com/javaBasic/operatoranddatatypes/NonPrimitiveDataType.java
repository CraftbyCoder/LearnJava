package com.javaBasic.operatoranddatatypes;

public class NonPrimitiveDataType {

    //global value
    static int number;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //declaration
        boolean alpha = true;
        char name = 'A';
        short sum = 23456;
        int num = 245679890;
        long value = 231315432;
        float div = 45.789f;
        double divs = 343532.575;
        // implicit
        int range = 234;
        // explicit
        short density = (short) 298989;
        int num2 = (int) 34.5;
        // default value
//		boolean b;
//		char c;
//		short s;
//		int i;
//		long l;
//		float f;
//		double d;
        // print of 1
        System.out.println("___________________________");
        System.out.println("Alpha = "+alpha);
        System.out.println("Char = "+name);
        System.out.println("sum = "+sum);
        System.out.println("num = "+num);
        System.out.println("value = "+value);
        System.out.println("div = "+div);
        System.out.println("divs = "+divs);
        System.out.println("___________________________");

        // implicit
        System.out.println(" implicit range = "+range);
        System.out.println("___________________________");

        // explicit
        System.out.println(" explicit density = "+density);
        System.out.println(" explicit num2 = "+num2);
        System.out.println("___________________________");

        //default
//		System.out.println(" Default Boolean = "+b);
//		System.out.println("Default Integer = "+ i);
//		System.out.println("Default Short = "+s);
//		System.out.println("Default Long = "+l);
//		System.out.println("Default Float = "+f);
//		System.out.println("Default Double = "+d);
//		System.out.println("Default Char = "+c);
        System.out.println("___________________________");


        // global
        System.out.println("Global Declaration = "+ number);



    }

}
