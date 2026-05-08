
//13. Rectangle Area
package rectanglearea;
import java.util.Scanner;
public class RectangleArea {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of Height: ");
        int height=sc.nextInt();
        System.out.print("Enter the value of Width: ");
        int width = sc.nextInt();
        double area = height*width;
        System.out.println("Rectangle area is: "+area);
        
    }
}
