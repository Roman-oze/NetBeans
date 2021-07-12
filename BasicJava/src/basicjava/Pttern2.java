
package basicjava;

import java.util.Scanner;




public class Pttern2 {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
       
        System.out.print("enter any local number :");
        int n = input.nextInt();
        
        for (int row =n; row >=1; row--) {
            
            for (int col = 1; col <=row; col++) {
               System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 1; row <=n-1; row++) {
            
            for (int col = 1; col <=row; col++) {
               System.out.print("*");
            }
            System.out.println("");
            
            
            
    }
    }
}