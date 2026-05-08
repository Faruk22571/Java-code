
package com.mycompany.swapnumbers;


//25 Swap Numbers
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the 1st Number (x): ");
        int x = input.nextInt();
        System.out.print("Enter the 2nd Number (y): ");
        int y = input.nextInt();       
        System.out.println("After change: x = " + x + ", y = " + y);
        swap(x, y);        
        input.close();
    }
    public static void swap(int a, int b) {
        int temp = a; 
        a = b; 
        b = temp; 
        System.out.println("Before change: x = " + a + ", y = " + b);
    }
}