
package arithemicdemo;

import java.util.Scanner;

public class ConditionalOperator {
  
 public static void main (String[]args){
 
 Scanner input = new Scanner (System.in);
 
 int num1 ,num2,large;
 System.out.print("enter 1st number :");
 num1= input.nextInt();
 
  System.out.print("enter 2nd number :");
 num2 = input.nextInt();
 
 large = (num1 > num2)? num1 : num2 ;
 
 System.out.print("Large number :"+large);
 
 
 
 
 
 
 
 
 
 
 
 
 
 }   
    
    
    
    
    
    
    
}
