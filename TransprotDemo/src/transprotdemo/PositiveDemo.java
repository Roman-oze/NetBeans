 
package transprotdemo;

import java.util.Scanner;


public class PositiveDemo {
    
    public static void main (String[]args){
    
        Scanner input = new Scanner(System.in);
        
        double num;
        System.out.print("ENTER ANY LOCAL NUMBER :");
        num = input.nextDouble();
        
        if(num>10){
         System.out.print("(positive)");
       }
       
        else if (num<10){
    
       System.out.print("nagetive");
    }
     
        else {
        
         System.out.print("Zero");
        }
        
        
        } 
    
    }  

