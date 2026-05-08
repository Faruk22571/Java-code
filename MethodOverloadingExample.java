

package com.mycompany.methodoverloadingexample;


//27  Method Overloading Example
public class MethodOverloadingExample {

    public static void main(String[] args) {
        System.out.println("Addition of two integers: " + add(10, 20));
        System.out.println("Addition of three integers: " + add(10, 20, 30));
        System.out.println("Sum of two doubles: " + add(10.5, 20.5));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}