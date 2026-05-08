//8. Accessing Private Members
package privatemembers;
class Student{
    private int Roll;
    private String Name;
    private float Mark;
    private void GetData(){
        Roll=123;
        Name="Tasin";
        Mark=32.76f;
    }
    void Display(){
        System.out.println("Roll is: "+Roll);
        System.out.println("Name is: "+Name);
        System.out.println("Mark is: "+Mark);
    }
}

public class PrivateMembers {
    public static void main(String[] args) {
        Student s= new Student();
//        s.GetData();
        s.Display();
    }
}
