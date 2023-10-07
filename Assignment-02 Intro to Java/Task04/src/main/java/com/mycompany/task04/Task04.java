package com.mycompany.task04;
import java.util.Scanner;


public class Task04 {

    static int convertTemp(int C){
        int F = ((C*9/5)+32);
        return F;
    }

    public static void main(String[] args) {
   
        
      
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius");
        int tempInC = temp.nextInt();
        System.out.println("Temperature in Celsius =  "+tempInC);
        System.out.println("Temperature in Fahrenheit"+convertTemp(tempInC));
        
        
        
   
      

        
        
        
    }
    
}