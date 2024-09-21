package com.java.fundamentals;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[]args){
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        System.out.println("enter value");
        int firstValue=  s.nextInt();
        System.out.println("enter 2nd value");
        int secondValue=  s.nextInt();
        System.out.println("Enter 3rd value");
        int thirdValue = s.nextInt();

        int sum = firstValue+secondValue+thirdValue;
        System.out.println("sum of values"+ sum);


    }

}
