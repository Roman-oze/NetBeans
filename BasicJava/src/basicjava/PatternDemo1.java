
package basicjava;

import java.util.Scanner;


public class PatternDemo1 {
    
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
        System.out.print("Enter any number :");
        int n = input.nextInt();
        
        
        
        for (int row = 1; row <=n; row++) {
            
            for (int col =1 ; col <=row; col++) {
                
                             System.out.print(" "+row);

        
        
            }
            System.out.println("");
        }
      
      
        for (int row =n; row >=1; row--) {
            
            for (int col =1 ; col <=row; col++) {
                
                             System.out.print(" "+row);

        }
             System.out.println("");
    }
    }
}