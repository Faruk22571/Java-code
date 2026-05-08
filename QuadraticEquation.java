
package com.mycompany.quadraticequation;

//18 Quadratic Equation
import java.util.Scanner;
public class QuadraticEquation {

    public static void main(String[] args) {
        double a,b,c;
        double d, root1,root2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value if a :");
        a = sc.nextDouble();
        System.out.print("Enter valur of b :");
        b = sc. nextDouble();
        System.out.print("Enter vale of c :");
        c = sc.nextDouble();
        d = b*b-4*a*c;
        if (d> 0){
        root1 = (-b + Math.sqrt(d))/(2*a);
        root2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("Root are real and diffrernt");
        System.out.println("Root 1 =" + root1);
        System.out.println("Root 2 =" + root2);
    }
        else if(d==0){
            root1 =-d/(2*a);
            System.out.println("roots are real and squal");
            System.out.println(" Root = "+ root1);
        }
                else{
                double realPart=-b/(2*a);
                double imaginaryPart = Math.sqrt(-d)/(2*a);
                System.out.println("Roots are imaginary");
                System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
                }
        sc.close();
        
      
    }
}
