//37 Interface  3.3.2 Page no:57, 
package interf;
interface Student {
    static final int Roll = 885500;
    static final String Name = "Omor Faruk";
    void Display();
}
class Result implements Student {
    public float Mark;
    @Override
    public void Display() {
        System.out.println("Roll is : " + Roll);
        System.out.println("Name is : " + Name);
    }
    public void GetMark() {
        Mark = 65.45f;
    }
    public void ShowMark() {
        System.out.println("Mark is :" + Mark);
    }
}
    public class Interf {
    public static void main(String args[]) {
        Result R = new Result();
        R.Display();
        R.GetMark();
        R.ShowMark();
    }
}