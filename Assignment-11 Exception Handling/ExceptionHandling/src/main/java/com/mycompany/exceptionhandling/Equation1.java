
package com.mycompany.exceptionhandling;

import java.util.InputMismatchException;

public class Equation1 extends Matrices{
    private int[][] result = new int[3][3]; 

    public Equation1() {
    }
    
    public void calculateSum(){
        try{
            for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result.length;j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
                        System.out.println("===== A+B =====");
            for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result.length;j++){
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
