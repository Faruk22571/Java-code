//12. Area of Traingle
package triangle;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the Value of b: ");
        int b=sc.nextInt();
        System.out.print("Enter the Value of c: ");
        int c=sc.nextInt();
        float s=(a+b+c)/2;
        if((a+b)>c && (b+c)>a && (c+a)>b){
            double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Traingle area is:" + area);
        }
        else{
            System.out.println("Traingle is not possible");
        }
        
    }
}
