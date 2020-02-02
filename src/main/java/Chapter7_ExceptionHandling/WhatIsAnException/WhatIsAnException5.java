package Chapter7_ExceptionHandling;

import java.util.Scanner;

/**
 * What is an exception → Avoid division by zero
 * Here is a program that reads numbers and performs some calculations. It outputs the result to the standard output.
 *
 * In some cases, the program will throw ArithmeticException. Fix the program, so that it prints "Division by zero!" instead of this exception.
 *
 * Sample Input 1:
 * 5 2 0 1
 * Sample Output 1:
 * 2
 */

public class WhatIsAnException5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if(b+c==0 || d==0){
            System.out.println("Division by zero!");
        } else{

            int result = a / ((b + c) / d);

            System.out.println(result);
        }
    }
}
/*
import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (b == 0 && c == 0 || d == 0 || b + c == 0) {
            System.out.println("Division by zero!");
        } else{
            int result = a / ((b + c) / d);
            System.out.println(result);
        }
    }
}
 */