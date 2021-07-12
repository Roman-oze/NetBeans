
package startingjava;

import java.util.Scanner;


public class SwitchDemo {
    
 public static void main(String []args){
 
 Scanner input = new Scanner (System.in); 
 
  int digit;
  System.out.print("ENTER THE ANY DIGIT :");
  digit = input.nextInt();
  
  switch(digit){
  
      case 0 :
          System.out.print("(ZERO)");
          break;
  case 1 :
          System.out.print("(TWO)");
          break;
  
  case 2 :
          System.out.print("(THREE)");
           break;
  case 3 :
          System.out.print("(FOUR)");
           break;
      
      case 4 :
          System.out.print("(FIVE)");
           break;
          
      default : 
          System.out.print("THATS AVAILABLE HERE :");
          
  }
 
    
 }    
 
 
 
 
 
 
 
 
 
 
 
 
 }   
    
