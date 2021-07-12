
package array_demo;

import java.util.Arrays;

public class Array8 {
    
    public static void main(String[] args) {
        
       System.out.print("ascending=");
             int [] number = {10,13,-5,8,6};
             Arrays.sort(number);
             for (int i = 0; i < 5 ; i++) {
             System.out.print(" "+number[i]);          
        }
                
        System.out.println(" ");
        
             System.out.print(" disecnding =");
             for (int i = 4; i > 0 ; i--) {
             System.out.print(" "+number[i]);   
    }
        System.out.println(" ");
        
        
        
        
     String [] name = {"roman","islam","sohel","jarin","naimul"};
             Arrays.sort(name);
             System.out.print(" As Name =");
             for (int i = 0; i < 5 ; i++) {
             System.out.print("  "+name[i]);     
      
                
            }
            System.out.println(" ");
            System.out.print(" Ds Name =");
            for (int i = 4; i >= 0 ; i--) {
            System.out.print("  "+name[i]);     
         }  
   
            System.out.println(" ");
    }  
        
   }
     
   
    
  