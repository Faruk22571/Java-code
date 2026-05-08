//35  Multiple Inheritance Example
package main1;
class Student {
    int Roll;
    String Name;

    void GetData() {
        Roll = 96002;
        Name = "Wahid";
    }

    void Display() {
        System.out.println("Inside Student Class");
        System.out.println("Roll is: " + Roll);
        System.out.println("Name is: " + Name);
    }
}
class Exam extends Student {
    float Mark;

    @Override
    void GetData() {
        super.GetData();
        Mark = 85.5f;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("Inside Exam Class");
        System.out.println("Mark is: " + Mark);
    }
}
class Result extends Exam {
}
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Output:");
        Result result = new Result();
        result.GetData();
        result.Display();
    }
}