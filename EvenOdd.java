
package com.mycompany.evenodd;


//26 Even Odd check
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (isEven(num)) {
            System.out.println(num + " This is even number");
        } else {
            System.out.println(num + " This is odd number");
        }
        input.close();
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}