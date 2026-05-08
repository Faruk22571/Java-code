
//7. Accessing Public Members
package publicmembers;
class Student{
    public int Roll;
    public String Name;
    public float Mark;
    public void GetData(){
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

public class PublicMembers {
    public static void main(String[] args) {
        Student s= new Student();
        s.GetData();
        s.Display();
    }
}
