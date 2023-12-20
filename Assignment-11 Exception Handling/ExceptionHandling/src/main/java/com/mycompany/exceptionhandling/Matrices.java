package com.mycompany.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrices{
    protected int[][] A = new int[3][3]; 
    protected int[][] B = new int[3][3]; 
    Scanner sc = new Scanner(System.in);
    //methods
    public void takeInputInA(){
        try{
            System.out.println("===== Input In A =====");
            for(int i = 0;i<A.length;i++){
                for(int j = 0;j<A.length;j++){
                    System.out.println("Enter the value of position "+i+j+" : ");
                    A[i][j] = sc.nextInt();
                }
            }
        }
        catch(IndexOutOfBoundsException | NullPointerException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
        
    }
    public void takeInputInB(){
           try{
            System.out.println("===== Input In B =====");
            for(int i = 0;i<B.length;i++){
                for(int j = 0;j<B.length;j++){
                    System.out.println("Enter the value of position "+i+j+" : ");
                    B[i][j] = sc.nextInt();
                }
            }
        }
        catch(IndexOutOfBoundsException | NullPointerException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

}
