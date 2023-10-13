package com.mycompany.mavenproject2;
import java.util.Scanner;

public class Patient {
    String p_name,p_email,p_complain;
    int p_number,p_age,p_bill,p_contact;
    
    public void takePatientRecord(){
        Scanner p_input = new Scanner(System.in);
        System.out.print("Enter your'e Name : ");
        p_name = p_input.nextLine();
         System.out.print("Enter your'e Email : ");
        p_email = p_input.nextLine();
         System.out.print("Enter your'e Complain : ");
        p_complain = p_input.nextLine();
         System.out.print("Enter your'e Patient ID : ");
        p_number = p_input.nextInt();
         System.out.print("Enter your'e Age : ");
        p_age = p_input.nextInt();
         System.out.print("Enter your'e Contact no : ");
        p_contact = p_input.nextInt();
        p_input.nextLine();
         System.out.print("Enter your'e Bill : ");
        p_bill = p_input.nextInt();  
    }
    
    public void printReceipt(){
        System.out.println("===================== Reciept =====================");
        System.out.println("Patient's Name : "+ p_name);
        System.out.println("Patient's Email : "+ p_email);
        System.out.println("Patient's Complain : "+ p_complain);
        System.out.println("Patient's ID : "+ p_number);
        System.out.println("Patient's Age : "+ p_age);
        System.out.println("Patient's Contact : "+ p_contact);
        System.out.println("Patient's Bill : "+ p_bill);
        System.out.println("===================================================");


    }
}
