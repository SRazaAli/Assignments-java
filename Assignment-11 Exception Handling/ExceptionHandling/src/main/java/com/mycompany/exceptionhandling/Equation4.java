package com.mycompany.exceptionhandling;

import java.util.InputMismatchException;

public class Equation4 extends Matrices{
        private int scalarValue;
        private int[][] result = new int[3][3]; 

    public Equation4() {
    }
 public void calculateProduct(){
        try{
            
            System.out.println("Enter a value : ");
            scalarValue = sc.nextInt();
            if(scalarValue==0){
                System.out.println("Enter a non zero value....");
            }
            else{
                 for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
               result[i][j] =A[i][j] * B[i][j]*scalarValue ;
            }
            }
           
        }
                    System.out.println("===== A*B*scalarValue =====");

            for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A.length;j++){
                System.out.print(result[i][j]+"   ");
            }
            System.out.println("\n");
        }
        }
         catch(IndexOutOfBoundsException | NullPointerException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
