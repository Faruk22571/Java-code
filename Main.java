
package com.mycompany.main;



// 22 Constructor Method
public class Main {
    public int addNumber( int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        Main obj = new Main();
        int result = obj.addNumber(num2, num2);       
        System.out.println("Sum is :"+result);
    }
}
