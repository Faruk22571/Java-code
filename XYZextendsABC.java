
package com.mycompany.xyzextendsabc;


// 33 Method Overriding or Polymorphism Example
class ABC {
    public void result() {
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println("Result from ABC (Sum) = " + c);
    }
}
public class XYZextendsABC extends ABC {
    
    @Override
    public void result() {
        int a = 20;
        int b = 10;
        int c = a - b;
        System.out.println("Result from XYZextendsABC (Subtraction) = " + c);
    }

    public static void main(String[] args) {
        ABC obj = new XYZextendsABC();
        obj.result();
    }
}