

package com.mycompany.numberclassifier;






//16 number Classifier
public class NumberClassifier {
    public static void main(String[]args){
        classifyNumber(7);
        classifyNumber(-3);
        classifyNumber(0);
    }
    public static void classifyNumber(int number){
        if(number>0){
            System.out.println("This number is positive: " +number);;
        }
        else if(number<0){
            System.out.println("This number is nagative: " +number);
        }
        else{
            System.out.println(" This number is zero: "+number);
        }
    }
}
