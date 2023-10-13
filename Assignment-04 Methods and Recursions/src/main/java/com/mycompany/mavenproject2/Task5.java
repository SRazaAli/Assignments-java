package com.mycompany.mavenproject2;
import java.util.Scanner;

class Task5{
    int a,b;
    int i = 0,sum = 0;
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integar : ");
        a = input.nextInt();
        System.out.print("Enter another positive integar : ");
        b = input.nextInt();
    }
    
    int computeSum(){
        if(a>=0 && b>=0 && a<=b){
            if(i<=b){
                sum+=a;
                a+=1;
                computeSum();
            }
        }
       
        return sum;
    }
}
