
package File_Directory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Data_Get {
    public static void main(String[] args) {
        
       try{
        File file = new File("C:/Users/saifu/Documents/VideoMakerFX/Projects/roman.txt");
        Scanner scan = new Scanner (file);
        
        while(scan.hasNext()){
        
        
       int id = scan.nextInt();
       String name = scan.next();
            System.out.println(" Id :"+id+" name :"+name);
        }
        
       }catch(Exception e){
                
                System.out.println(e);
                
                }
        
        }
        
        
       
    }
  

