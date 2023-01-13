package com.bridgelab;

import java.util.Scanner;

public class Fibonacci {
    static int a = 0;
    static  int b = 1;
    static int sum = 0;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of series : ");
       int n = scanner.nextInt();
       for ( int i = 0 ; i < n ; i++){
           System.out.print(a + ",");
            sum = a + b ;
            a = b;
            b = sum;

       }

    }
}
