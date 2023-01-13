package com.bridgelab;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be checked for armstrong : ");
        double num = scanner.nextDouble();
        int count = 1;
        while (num != 0) {
            for (int i = 0; i <= count; count++) {
                double digit = num % 10;
                double ten = num / 10;
                double hundred = num / 100;
                double num1 = (Math.pow(digit, count) + Math.pow(ten, count) + Math.pow(hundred, count));
                if (num == num1) {
                    System.out.println(num + " is Armstrong");
                }
            }
        }
    }
}
