//Abstract Example (3.5 Page no:63)
package abstractexample;
abstract class Student {
    public int roll;
    public String name;
    abstract void GetData();
}
class Result extends Student {
    float Mark;
    @Override
    void GetData() {
        roll = 885500;
        name = "Omor Faruk";
        Mark = 88.4f;
    }
    void Display() {
        System.out.println("Roll is " + roll);
        System.out.println("Name is " + name);
        System.out.println("Mark is " + Mark);
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Result R = new Result();
        R.GetData();
        R.Display();
    }
}