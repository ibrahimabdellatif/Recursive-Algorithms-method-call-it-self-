package com.company;
// module three in kasey java course on microsoft...
import java.util.*;
import java.math.MathContext;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number that you need to get a factorial of them");
        int number = input.nextInt();
        System.out.println("factorial "+number+" = " + factorial(number));
    }
/*
    Recursion Algorithm means method call it self without loop.
    example / get a factorial of number like 6!
    n*(n-1)*(n-2)*(n-3)*(n-3)

 */
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

}