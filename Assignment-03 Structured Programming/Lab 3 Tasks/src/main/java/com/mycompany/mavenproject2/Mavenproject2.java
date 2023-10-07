package com.mycompany.mavenproject2;
import java.util.Scanner;

 class Tasks{
     //Task---01
 public void Task1(){
     String myStr = "Hello! I am a String in java. I have several functions and I am very 'important' #String_is_important";
     System.out.println("-------------- Spliting Strings -------------- ");
     System.out.println(myStr);
     System.out.println("Spliting at ! :"+myStr.substring(0,myStr.indexOf("!")+1));
     System.out.println("Splitting from ! to Important : "+myStr.substring( (myStr.indexOf("!")+1), 
             (myStr.lastIndexOf("'")+1)));
     System.out.println("Splitting from Important to # : "+myStr.substring((myStr.lastIndexOf("'")+1)
             ,myStr.lastIndexOf("t")+1) );
 }
 //Task---02
 public void Task2(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number between 1 to 7 : ");
     int day = sc.nextInt();
     if(day == 1)
         System.out.println("It is sunday");
     else if(day == 2)
         System.out.println("It is Monday");
     else if(day == 3)
             System.out.println("It is Tuesday");
     else if(day == 4)
         System.out.println("It is Wednesday");
     else if(day == 5)
         System.out.println("It it Thursday");
     else if(day == 6)
         System.out.println("It is Friday");
     else if(day == 7)
         System.out.println("It ts Saturday");
     else 
         System.out.println("Invalid Input!!");
 }
 //Task---03
 public void Task3(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        String alphabet = sc.nextLine();
        char myChar = alphabet.charAt(0);
       
        if(myChar == 'a' ||myChar == 'A' || myChar == 'e' || myChar == 'E' || myChar == 'i' || myChar == 'I' || myChar == 'o' ||
                myChar == 'O' ||myChar == 'u' ||myChar == 'U'){
            System.out.println(myChar+" is a Vowel");
        }
        else{
           System.out.println(myChar+" is a consonant");
        }
       
 }
 
 //Task---04
 public void Task4(){
     int size = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of Array: ");
     size = sc.nextInt();
     
     int[] arr = new int[size];
     //arr input
     for(int i =0;i<size;i++){
         System.out.println("Enter the value of index of: "+i);
          arr[i] =sc.nextInt();
     }
     //arr output
     for(int i = 0;i<size;i++){
         System.out.println("The value ofindex no "+i+" is "+arr[i]);
     }
     
     int maxNumber = arr[0];
     int minNumber = arr[0];
     int indexOfMin = 0;
     int indexOfMax = 0;
     //for maxNumber
     for(int i = 0;i<size;i++){
         if(arr[i]>maxNumber){
             maxNumber = arr[i];
             indexOfMax =i;
         }
    }
     
       //for minNumber
     for(int i = 0;i<size;i++){
         if(arr[i]<minNumber){
             minNumber = arr[i];
             indexOfMin =i;
         }
    }
     
 
     System.out.println("Size of Array : "+size);
     System.out.println("Max value of array : "+maxNumber);
     System.out.println("Index of Max value : "+indexOfMax);
     System.out.println("Min value of array : "+minNumber);
     System.out.println("Index of Min value : "+indexOfMin);
     
     
 }
 //Task ---06
 public void Task6(){
     String myStr = "This is the exercise of OOP basics";
     System.out.println("String before replacing : ");
     System.out.println(myStr);
     System.out.println("String after replacing : ");
     String newStr = myStr.replace("OOP", "IICT");
     System.out.println(newStr);
 }
}

public class Mavenproject2 {

 
    public static void main(String[] args) {
        Tasks taskObj = new Tasks();
        taskObj.Task6();
    }
   
}