//42 Run time polymorphism( 3.4 Page no:61)
package test;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
        System.out.println("Omor Faruk");
    }
}
public class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}