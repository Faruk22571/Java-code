
package com.mycompany.addmethodjava;
// 23 Add Method Java
import java.util.Scanner;

public class AddMethodJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        Calculator calculator = new Calculator(num1, num2);
        int addition = calculator.addNumbers();
        System.out.println("The sum is: " + addition);
        input.close();
    }
}
class Calculator {
    private int num1;
    private int num2;
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int addNumbers() {
        return num1 + num2;
    }
}