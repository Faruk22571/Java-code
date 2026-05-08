
package com.mycompany.oddseriessum;


//17 Odd Series Sum
public class OddSeriesSum {
    static int findSum(){
        int sum = 0;
        for (int i=1; i<=100;i+=2){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = findSum();
        System.out.println("1+3+5+....+100= " + result);
    }
}
