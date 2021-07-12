
package date.of.time;


import java.text.SimpleDateFormat;
import java.time.LocalTime;

import java.util.Date;

public class DateOfTime {

   
    public static void main(String[] args) {
        
        
         Date dt = new Date();
          System.out.println(dt);
         
         
          LocalTime  obj  = LocalTime.now();
        System.out.println(obj);
         
//        LocalTime myObj = LocalTime.now();
//    System.out.println(myObj);
       
    
        
    
    Date date = new Date();  
    
   
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
   String da = formatter.format(date);  
    System.out.println(da);  
    
    
        
 
    
//    SimpleDateFormat formatter = new  SimpleDateFormat("dd/MM/yyyy");
//    String Date = formatter.format(date);
//    System.out.println(""+date);
//      
       
}  
        
        
      
        
        
        
        
        
        
        
        
        
        
    }
   
