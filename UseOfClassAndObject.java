//10. Use of Class and Object
package useofclassandobject;
class Student{
    int Roll=10;
    String Name= "Rahim";
    void Show(){
        System.out.println(Name+"er Roll holo "+Roll);
    }
}
public class UseOfClassAndObject {
    public static void main(String[] args) {
        Student s= new Student();
        s.Show();
    }
}
