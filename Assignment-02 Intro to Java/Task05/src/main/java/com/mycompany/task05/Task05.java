package com.mycompany.task05;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {



                Scanner sc =  new Scanner (System.in);
             System.out.println("Enter number of cookies produced");
             int numbers = sc.nextInt();

             int boxes=numbers/12;

             System.out.println("no of boxes = "+boxes);
             int cartons = boxes/24;

        System.out.println("Number of cartoons : "+cartons);
        int leftover = cartons%24;
        System.out.println("Number of leftovers:"+leftover);
        double totalmoney = (cartons*1.14);
        double leftovermoney = (leftover * 57);
        System.out.println("Totalmoney : "+totalmoney);
        System.out.println("leftover : "+leftover);
        System.out.println("Leftover money: " + leftovermoney);
        
        
  
        
        
        
    }
    
}
    
