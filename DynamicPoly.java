
package dynamicpoly;

class ABC {
    public void result() {
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println("Result from ABC (Sum) = " + c);
    }
}
class XYZ extends ABC {
    
    @Override
    public void result() {
        int a = 20;
        int b = 10;
        int c = a - b;
        System.out.println("Result from XYZextendsABC (Subtraction) = " + c);
    }
}
public class DynamicPoly {
    public static void main(String[] args) {
        // TODO code application logic here
         ABC obj = new XYZ();
        obj.result();
    }
    
}
