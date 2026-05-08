
package about.pkginterface;

//40 Interface polygon (3.3.5 Page no:60)
interface Polygon {
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
        System.out.println("Cox's bazar polytechnic institute");
         System.out.println("Conputer Science And Technology");
        System.out.println("Omor Faruk");
        System.out.println("5th Semester 2nd Shift");
    }
}
class AboutInterface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}