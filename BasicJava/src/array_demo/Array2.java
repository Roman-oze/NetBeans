
package array_demo;

import java.util.Scanner;


public class Array2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
       double [] number = new double [5];
       double sum =0;
       
       
        System.out.print("please enter 5 number :");
        
        for (int i =0; i< number.length; i++){
            
        number[i] = input.nextDouble();
        
        }
        
        for (int i = 0; i < number.length; i++) {
            
            sum = sum + number[i];
        }
        
        
        System.out.println("sum of result ="+sum);
        
        System.out.println("avarge number "+sum/number.length);
        
        
        double max = number[0] ;
        double min = number[0];
        
        for (int i = 1; i <5; i++) {
            
            if(max < number[i]){
               max = number[i];
        }  
            if(min > number[i]){
               min = number[i];
        }
            
        
        }
      
        
              System.out.println("maximum :"+max);  
              
              System.out.println("minimum :"+min);    
        
        
        System.out.println("ekhne double [] number = new double [5]; "
                + "array kaj ekhne thke tmi chaile 5 na likhe"
                + " number.length likhte paro ");
        
        
    }
}
