
package string_package;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Date_78 {
    
    public static void main(String[] args) {
            
         Date date = new Date();
         
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
         
        String current = format.format(date);
         
         System.out.println("Current date :"+current);
        
        
        
               
        
        
    }
}
