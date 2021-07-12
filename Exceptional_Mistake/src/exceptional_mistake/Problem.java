
package exceptional_mistake;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        try{ 
            
        System.out.print("Please Enter the num1 :");
        int num1 = input.nextInt();
        
        System.out.print("Please Enter the num2 :");
        int num2 = input.nextInt();
        int result = num1/num2;
        System.out.println("Result :"+ num1 + "/" + num2 + " = " + result);
       
    
        
        }
        catch(Exception e){
       
        System.out.println("Exception problem :"+ e);
            System.out.println("Thank you so much get me your attenstion");
      }
       }  
//        int count =1;
//       do {
//            
//        try{ 
//            
//        System.out.print("Please Enter the num1 :");
//        int num1 = input.nextInt();
//        
//        System.out.print("Please Enter the num2 :");
//        int num2 = input.nextInt();
//        int result = num1/num2;
//        System.out.println("Result :"+ num1 + "/" + num2 + " = " + result);
//       
//        count = 2;
//        
//        }
//        catch(Exception e){
//       
//        System.out.println("Exception problem :"+ e);
//      }
//       }  
//       while(count==1);  
//  
    
    } 
  

