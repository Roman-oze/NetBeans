
package File_Directory;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class File_Create {
    
    public static void main(String[] args){
        
         Scanner input = new Scanner(System.in);
        
     
        Formatter form = new Formatter();
        
//         form.format("%s %s\n",211,"Roman");
//         form.format("%s %s\n",221,"Jarin");
//         form.format("%s %s\n",251,"Zannat");
//          System.out.println(""+form);
         
         System.out.print("Enter Any Roll Number :");
         int num = input.nextInt();
         
         for (int i = 1; i <= num; i++) {
            
        }
         System.out.print("Enter Any Name :");
         String name = input.next();
         
        System.out.print("Enter Any class :");
         String cls = input.next();
         
            form.format("%s %s\n",name,cls);
         
//         System.out.print("Enter Any class :");
         //String cls = input.next();
         
         
         form.format("%s %s\n",name,cls);
         
        
         
         
         
         
         
      
       
        
        
    }
 
}
