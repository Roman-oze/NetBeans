
package arithemicdemo;

import java.util.Scanner;

public class ArithemicDemo {

    public static void main(String[] args) {
   
        
      Scanner input = new Scanner (System.in); 
    
    int num1,num2,result;
    
   System.out.println("Enter the first number :");
   num1 = input.nextInt();
   
   System.out.println("Enter the second number  :");
   num2 = input.nextInt();
   
   result = num1 + num2;
   System.out.println("sub ="+result);
  
   
   
    result = num1 - num2;
    System.out.println("sum ="+result);
    
   
    result = num1 / num2;
    System.out.println("muti ="+result);
    
    result = num1 * num2;
    System.out.println("div ="+result);
    
    result = num1 % num2;
    System.out.println("remainder ="+result);
    
             
    
    
    
    }
    
}
    
        
        
        
        
        
        
        
        
        
        
    
    

