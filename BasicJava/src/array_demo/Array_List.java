
package array_demo;

import java.util.ArrayList;


public class Array_List {
    public static void main(String[] args) {
        
     ArrayList<Integer>number = new ArrayList<Integer>();   
        
        System.out.print(" serial number :");
     
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
       number.add(3,50);
        
   
            System.out.print(" "+number); 
        
        System.out.println("");
        
        System.out.println(" size ="+number.size());
        
        
        // adding removing
           number.remove(1);
        System.out.print("Remove 20 :"+number);
     
      
        
        // all remove
        System.out.println("");
            number.removeAll(number);
        System.out.println("All remove number :"+number);
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
