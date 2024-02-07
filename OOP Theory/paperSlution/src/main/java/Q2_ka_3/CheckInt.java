
package Q2_ka_3;
import java.io.*;
public class CheckInt {
    public static boolean fileExists(String fileName) throws Exception{
        try{
            File file = new File(fileName);
            return file.exists();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    public static boolean isInt(String value) throws NumberFormatException{
        try{
            int valueInInt = Integer.parseInt(value);   
            return true;
    }
        catch(NumberFormatException  e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public static boolean isDouble(String value) throws NumberFormatException{
        try{
            double valueInDouble = Double.parseDouble(value);   
            return true;
    }
        catch(NumberFormatException  e){
            System.out.println(e.getMessage());
            return false;
        }
        

    
}
