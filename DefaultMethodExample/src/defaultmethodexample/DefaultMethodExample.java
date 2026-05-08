//41 Default Method Example (3.3.5 Page no:60-61)
package defaultmethodexample;
interface Polygon {
    void getArea();
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
class MyRectangle implements Polygon {
    @Override
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }
    @Override
    public void getSides() {
        System.out.println("I have 4 sides.");
        System.out.println("Omor Faruk");
    }
}
public class DefaultMethodExample {
    public static void main(String[] args) {
        MyRectangle rect = new MyRectangle();
        rect.getArea();
        rect.getSides();
    }
}