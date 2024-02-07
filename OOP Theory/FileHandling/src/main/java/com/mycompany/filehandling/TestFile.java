
package com.mycompany.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {
    
    
    public void outputFile(){
        try{
            String fileName = "meriFile";   //creting file
            PrintWriter outFile = null;
            outFile = new PrintWriter(fileName);
            
            Scanner sc = new Scanner(System.in);    //taking input
            System.out.println("Enter 2 lines in file...");
            
            for(int i = 0;i<2;i++){                 //printing in file
                System.out.println("Enter line : 0"+i);
                String line = sc.nextLine();
                outFile.write(line+"\n");
            }
            outFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void inputFile(){
        try{
            //creating file
            String fileName = "merFile";
            FileReader fr = new FileReader(fileName);
            
            //scanning file
            Scanner sc = new Scanner(fr);
            
            //fetching data
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(sc);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    public void appendFile(){
        try{
            //content to be added
            String content = "This content will be appended in file...";
        String fileName = "meriFile";
        
        File file = new File(fileName);

        if(!file.exists()){
            file.createNewFile();
        } 
        
        //creating temp virtual storage area
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
