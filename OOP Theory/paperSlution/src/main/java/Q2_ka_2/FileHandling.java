
package Q2_ka_2;
import java.io.*;
import java.util.*;
public class FileHandling {
    
    public static void main(String[] args){
        try{
            String fileName1 = "Original.txt";
            FileReader fr = new FileReader(fileName1);
            Scanner sc = new Scanner(fr);
            String fileName2 = "copied.txt";
            PrintWriter outFile = null;
            outFile = new PrintWriter(fileName2);
            while(sc.hasNext()){
                String line = sc.nextLine();
                outFile.write(line);
            }
            outFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
