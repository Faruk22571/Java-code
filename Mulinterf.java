//38 Multiple Interface 3.3.3. Page no:58
package mulinterf;
interface Student {
    String Name = "Omor Faruk";
}
interface Exam {
    int Roll = 885500; 
    void Display();
}
class Result implements Student, Exam {
    public float Mark;
    @Override
    public void Display(){
        System.out.println("Roll is : " + Roll);
        System.out.println("Name is : " + Name);
    }
    public void GetMark(){
        Mark = 87.5f;
    }
    public void ShowMark() {
        System.out.println("Mark is :" + Mark);
    }
}
public class Mulinterf {
    public static void main(String args[]) {
        Result R = new Result();
        R.Display();
        R.GetMark();
        R.ShowMark();
    }
}