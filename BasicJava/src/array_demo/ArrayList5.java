
package array_demo;

import java.util.ArrayList;


public class ArrayList5 {
   
    public static void main(String[] args) {
        
        ArrayList <Integer> number = new ArrayList <Integer> ();
        System.out.println("size ="+number.size());
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        
        System.out.println("size  ="+number.size());
        System.out.println("The number "+number);
        
            
         boolean pos =  number.contains(30);
        System.out.println(" 10 in is the list ="+pos);
        
        
        boolean r=  number.isEmpty();
        System.out.println("Array list  is Empty = "+r);
        
        int c = number.indexOf(20);
        System.out.println("index ="+c);
        
        
     
        
   
     
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
