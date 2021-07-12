
package transprotdemo;

import java.util.Scanner;


public class TransprotDemo {

    
    public static void main(String[] args) {
       
    Scanner input = new Scanner (System.in);    
     
    int mile_coverd ;
    double fuel_of_liter ;
    double miles_per_liter;
    
    
    System.out.print("enter the (mile): ");
    mile_coverd = input.nextInt();
    
     System.out.print("enter the (fuel_of_liter): ");
  fuel_of_liter = input.nextDouble();
   
   miles_per_liter = mile_coverd / fuel_of_liter;
   
    System.out.print("miles pre liter (MPG) : "+ miles_per_liter);
   
   
    
    
    
    
    
    }
    
}
