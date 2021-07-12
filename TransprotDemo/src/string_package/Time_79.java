
package string_package;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;




public class Time_79 {
    
    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();
        
        DateTimeFormatter y = DateTimeFormatter.ofPattern("hh:mm:ss");
        
        String x = time.format(y);
        
        System.out.println(" Current Time :- "+x);
 
      
                
    }
}
