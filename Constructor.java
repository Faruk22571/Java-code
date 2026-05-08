
package com.mycompany.constructor;

//28 Constructor Example
class student{
    int Roll;
    String Name;
    float Mark;
    public student(){
        Roll = 885500;
        Name = "Omor Faruk";
        Mark = 80.80f;
        System.out.println("Roll is: "+Roll);
        System.out.println("Name is: "+Name);
        System.out.println("Mark is: "+Mark);
    }
}
public class Constructor {

    public static void main(String[] args) {
       student s = new student();
    }
}
