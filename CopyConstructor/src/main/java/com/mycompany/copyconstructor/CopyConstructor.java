
package com.mycompany.copyconstructor;

//29 Copy Constructor Example
class student{
    int roll;
    student(int r){
        roll = r;
    }
    student(student s) {
        roll = s.roll;
    }
    void Display(){
        System.out.print("Roll is: "+roll);
    }
}
public class CopyConstructor {

    public static void main(String[] args) {
        student s1 = new student(101);
        s1.Display();
        System.out.println();
        student s2=new student(s1);
        s2.Display();
        System.out.println(" Both are same");
    }
}
