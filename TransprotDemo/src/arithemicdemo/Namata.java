
package arithemicdemo;

import java.util.Scanner;

public class Namata {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First Digit :");
       int  m =input.nextInt();
       
       for (int i=1; i<10; i++){
           
           System.out.println(m+" X "+i+"="+m*i);
       
       }
       
       
          System.out.print("Enter the First Digit :");
       int  a =input.nextInt();
       
        System.out.print("Enter the Second Digit :");
       int  b =input.nextInt();
       
       for (int i=a; i<b; i++){
           for (int j = 1; j < 10; j++) {
               
             
               System.out.println(i+" X "+j+"="+i*j);
               
               
       }
        
          System.out.println("\n ");
        
        
        
        
        
        }
    }
    
}
