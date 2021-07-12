
package arithemicdemo;

import java.util.Scanner;

public class TemperatureDemo {
   
 public static void main (String[]args){
 
 Scanner input = new Scanner (System.in);
 
 double celsius,  fehren ;
 
 System.out.print("CELCIUS :");
 celsius = input.nextDouble();
 
     fehren = 1.8 * celsius + 32;
  
 System.out.print("fehren =" +  fehren );
 
 }   
    
    
    
}
