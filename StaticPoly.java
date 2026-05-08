
package com.mycompany.staticpoly;

// 32  Overridden StaticPoly
class Calculator{
    int add(int x, int y){
//        String sum = "5"+"6";
//        System.out.println(sum);
        System.out.println(x+y);
        return x+y;
    }
    int add(int a, int b, int c){
        return a+b+c;  
    }
}
public class StaticPoly {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(12,24);
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
