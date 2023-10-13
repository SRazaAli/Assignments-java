package com.mycompany.mavenproject2;
import java.util.Scanner;

    class Task3{
    int[][] mat_1 = new int[3][3];
    int[][] mat_2 = new int[3][3];
    Scanner input = new Scanner(System.in);
    
    //for tasking inputs in arrays
    void inputInArrays(){
        //For mat_1
        System.out.println("Enter the elements of mat_1");
        for(int i = 0;i<mat_1.length;i++){
            for(int j = 0;j<mat_1.length;j++){
                System.out.print("Enter the value of position "+i+""+j+" : ");
                mat_1[i][j] = input.nextInt();
            }
        }
        
         //For mat_2
                 System.out.println("Enter the elements of mat_2");

        for(int i = 0;i<mat_2.length;i++){
            for(int j = 0;j<mat_2.length;j++){
                System.out.print("Enter the value of position "+i+""+j+" : ");
                mat_2[i][j] = input.nextInt();
            }
        }
        
        //printing arrays
        System.out.println("================== Arrays After Taking Input ==================");
        System.out.println("mat_1 is given as : ");
        for(int i = 0; i<mat_1.length; i++){
            for(int j = 0; j<mat_1.length; j++){
                System.out.print(mat_1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("mat_2 is given as : ");
          for(int i = 0; i<mat_2.length; i++){
            for(int j = 0; j<mat_2.length; j++){
                System.out.print(mat_2[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
    }
    
    //For Equation1
    void equation1(){
        //mat_1 * 3
        for(int i = 0; i<mat_1.length; i++){
            for(int j = 0; j<mat_1.length; j++){
                mat_1[i][j] = (mat_1[i][j]) * 3;
            }
        }
        
        //mat_2 * 2
           for(int i = 0; i<mat_2.length; i++){
            for(int j = 0; j<mat_2.length; j++){
               mat_2[i][j] = (mat_2[i][j]) * 2;
            }
        }
           
           
        //adding both arrys
        int[][] mat_ans = new int[3][3];
        for(int i = 0; i<mat_ans.length; i++){
            for(int j = 0; j<mat_ans.length; j++){
                mat_ans[i][j] = mat_1[i][j] + mat_ans[i][j];
            }
        }
        
        //printing result
        System.out.println("================== Arrays After Performing Eq1 ==================");
        System.out.println("(Mat_1*3) + (Mat_2*2)");
        for(int i = 0; i<mat_ans.length; i++){
            for(int j = 0; j<mat_ans.length; j++){
                System.out.print(mat_ans[i][j] +"\t");
            }
            System.out.print("\n");
        }
    }
    
    //for equation 2
    void equation2(){
        //mat_2 - 3
        for(int i = 0; i<mat_2.length; i++){
            for(int j = 0; j<mat_2.length; j++){
                mat_2[i][j] = (mat_2[i][j]) - 3; 
            }
        }
        
        //mat_2-3 *2
        int[][] mat_ans = new int[3][3];
        for(int i = 0; i<mat_ans.length; i++){
            for(int j = 0; j<mat_ans.length; j++){
                mat_ans[i][j] = mat_2[i][j] * 2;
            }
        }
        
        //printing final array
        System.out.println("================== Arrays After Performing Eq2 ==================");
        System.out.println("(Mat_2-3)*2");
        for(int i = 0; i<mat_ans.length; i++){
            for(int j = 0; j<mat_ans.length; j++){
                System.out.print(mat_ans[i][j] +"\t");
            }
            System.out.print("\n");
        }
    }
    
    
    //for equation3
      void equation3(){
          //mat_2*5
          for(int i = 0; i<mat_2.length; i++){
              for(int j = 0; j<mat_2.length; j++){
              mat_2[i][j] = (mat_2[i][j]) * 5;
          }
          }
          
          //mat_1-2
          for(int i = 0; i<mat_1.length; i++){
              for(int j = 0; j<mat_1.length; j++){
                  mat_1[i][j] = (mat_1[i][j]) - 2;
              }
          }
          
          //for final array
          int[][] mat_ans = new int[3][3];
          for(int i = 0; i<mat_ans.length; i++){
              for(int j = 0; j<mat_ans.length; j++){
                  mat_ans[i][j] = mat_2[i][j] - mat_1[i][j];
              }
          }
          
          
          //printing final array
          System.out.println("================== Arrays After Performing Eq3 ==================");
        System.out.println("(Mat_2*5)-(Mat_1*2)");
        for(int i = 0; i<mat_ans.length; i++){
            for(int j = 0; j<mat_ans.length; j++){
                System.out.print(mat_ans[i][j] +"\t");
            }
            System.out.print("\n");
        }
      }      
    
}
