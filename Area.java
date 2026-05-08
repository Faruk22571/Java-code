
//11. Area of Circle
package area;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the radious: ");
        int radious = s.nextInt();
//        float radious = 12;
        double area = 3.1416*radious*radious;
        System.out.println(area+ " is area");
    }
}
