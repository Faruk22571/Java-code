package com.mycompany.methodcirclearea;

//24  Method Circle Area
import java.util.Scanner;

public class MethodCircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of R: ");
        double r = input.nextDouble();
        System.out.println("Area is " + c_area(r));
        input.close(); 
    }
    static double c_area(double r) {
        return Math.PI * r * r; 
    }
}