package com.mycompany.exceptionhandling;

import java.util.InputMismatchException;


public class Equation3 extends Matrices{
    private int scalarValue;

    public Equation3() {
    }
    public void calculateProduct(){
        
        try{
            System.out.print("Enter a value : ");
        scalarValue = sc.nextInt();
            for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                A[i][j] *=scalarValue;
            }
        }
                        System.out.println("===== A*B =====");
            for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("\n");
        }
        }
         catch(IndexOutOfBoundsException | NullPointerException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
