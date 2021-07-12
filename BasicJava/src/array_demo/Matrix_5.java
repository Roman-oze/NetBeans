
package array_demo;

import java.util.Scanner;


public class Matrix_5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int[][] num = new int [3][3];
        
         System.out.println("Please enter number =");
         
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
            num[row][col]=input.nextInt();   
            System.out.println("  "+ num[row][col]);
            
            
            }
            System.out.println("  ");   
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
