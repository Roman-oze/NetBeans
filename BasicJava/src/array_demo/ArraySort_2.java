
package array_demo;

import java.util.ArrayList;
import java.util.Collections;


public class ArraySort_2 {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> number = new ArrayList <Integer>();
        
        
        number.add(20);
        number.add(10);
        number.add(-30);
        number.add(40);
        number.add(50);
        
        System.out.println("Sort Number ="+number);
        
        
        Collections.sort(number);
        System.out.println("Ascending Number ="+number);
        
       Collections.sort(number,Collections.reverseOrder());
        System.out.println("Descending number="+number);
        
        
        
        
        
        
        
        
        
    }
    
}
