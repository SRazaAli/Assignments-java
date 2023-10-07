package com.mycompany.task06;
import java.util.Scanner;
public class Task06 {

    static int rpm2(int rpm1,int diameter1, int diameter2){
        int rpm2 = (diameter1/diameter2 )* rpm1;
        return rpm2;
    }
    static int weightLifted(int forceExerted, int ropes){
        return forceExerted * ropes;
    }
    public static void main(String[] args) {
      
  
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ente diameter 1 : ");
        int diameter1 = input.nextInt();
         System.out.println("Ente diameter 2 : ");
        int diameter2 = input.nextInt();
         System.out.println("Ente RPM 1 : ");
        int rpm1 = input.nextInt();
        
        
        System.out.println("The Speed of pulley(RPM2) = "+rpm2(rpm1,diameter1,diameter2));
        System.out.println("Enter the Force Exerted : ");
        int forceExerted = input.nextInt();
          System.out.println("Enter the number of  up ropes: ");
        int ropes = input.nextInt();
       
        System.out.println("The Amount of lifted weight  = "+weightLifted(forceExerted,ropes));
        
        
        
        
    }
    
}
    

