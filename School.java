
//15. Use of method(30 page)
class Students{
//    member variable declare
    float mark1, mark2,tutorial;
    float total, GTotal;
//    float mark1, mark2,tutorial, total, GTotal;
//    float mark1;
//    float mark2;
//    float tutorial;
//    float total;
//    float GTotal;
     float GetMark(float m1, float m2){
//        function body
           mark1=m1;
           mark2=m2;
           total = mark1+mark2;
           return(total);
     }
     void Display(){
         tutorial = 10;
         GTotal = tutorial+GetMark(45,60);
         System.out.println("mark1 is: " + mark1);
         System.out.println("mark2 is: " +mark2);
         System.out.println("tutorial is: " +tutorial);
         System.out.println("total is: " +total);
         System.out.println("GTotal is: " +GTotal);
     }
}
public class School {
    public static void main(String[] args) {
        // TODO code application logic here
        Students s= new Students();
        s.Display();
    }
    
}
