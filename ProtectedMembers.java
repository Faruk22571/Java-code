//9. Accessing Protected Members
package protectedmembers;
class Student{
    protected int Roll;
    protected String Name;
    protected float Mark;
    protected void GetData(){
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

public class ProtectedMembers {
    public static void main(String[] args) {
        Student s= new Student();
        s.GetData();
        s.Display();
    }
}
