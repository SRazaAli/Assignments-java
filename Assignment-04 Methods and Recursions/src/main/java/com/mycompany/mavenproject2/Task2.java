package com.mycompany.mavenproject2;

public class Task2 {
    static int i = 0;
    static int sum = 0;
    
    //for Odd Numbers
    public static int computeOddSum(int number){
        if(i<number){
            if(i%2 != 0){
                sum+=i;
            }
            i+=1;
            computeOddSum(number);
        }
        i = 0;
        return sum;
    }
    
    //For Even Numbers
     public static int computeEvenSum(int number){
        if(i<number){
            if(i%2 == 0){
                sum+=i;
            }
            i+=1;
            computeEvenSum(number);
        }
        i = 0;
        return sum;
    }
}
