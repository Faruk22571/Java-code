//14. Object Reference Variable Assign
package objectreffvariableassign;
class Student{
    int Roll=10;
    String Name= "Rahim";
    void Show(){
        System.out.println(Name+"er Roll holo "+Roll);
    }
}
public class ObjectReffVariableAssign {
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1= new Student();
        Student s2=s1;
        s1.Show();
        s2.Show();
    }
}
