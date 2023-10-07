
package com.mycompany.task03;
import java.util.Scanner;


public class Task03 {
    static int sum(int a,int b){
        return a+b;
    }
     static int sub(int a,int b){
        return a-b;
    }
      static int mul(int a,int b){
        return a*b;
    }
       static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
     
        
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the value of a:");
          int a = input.nextInt();
          System.out.println("Enter the value of b:");
          int b = input.nextInt();
          
          System.out.println("Sum of "+a+" "+" and "+b+" is "+sum(a,b));
          System.out.println("Sum of "+a+" "+" and "+b+" is "+sub(a,b));
          System.out.println("Sum of "+a+" "+" and "+b+" is "+mul(a,b));
          System.out.println("Sum of "+a+" "+" and "+b+" is "+div(a,b));
        

}

    }