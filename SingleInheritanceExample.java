
package com.mycompany.singleinheritanceexample;


// 34 Single Inheritance Example
class Animal {
    void eat() {
        System.out.println("This animal can eat food");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking");
    }
}
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
    }
}