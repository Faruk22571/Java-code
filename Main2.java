
package main2;

//39 Simple Interface 3.3.4 Page no:59
import java.io.*;
interface In1 {
    int a = 885500;
    void display();
}
class TestClass implements In1 {
    @Override
    public void display() {
        System.out.println("Omor Faruk");
    }
}
public class Main2 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(In1.a);
    }
}