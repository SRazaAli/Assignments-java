package com.mycompany.task02;
import java.util.Scanner;

public class Task02 {
 static int equation1(int x, int y){
        return (2*(x*x) + (y*y)); 
    }
    static int equation2(int x,int y,int z){
        return (3*x + y -3*(z*z));
    }
    static int equation3(int x,int y,int z){
        return (2*x -2*y + 5*(z*z));
    }
    
        
   
    
    
  
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = input.nextInt();
        System.out.println("Enter the value of y: ");
        int y = input.nextInt();
        System.out.println("Enter the value of z: ");
        int z = input.nextInt();
        
        System.out.println("The value of eq1 is :" + equation1(x,y));
        System.out.println("The value of eq2 is :" +equation2(x,y,z));
        System.out.println("The value of eq3 is :" +equation3(x,y,z));
     
    
   
        
        
        
    }
    
}
