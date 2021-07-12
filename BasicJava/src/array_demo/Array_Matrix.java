
package array_demo;

import java.util.Scanner;


public class Array_Matrix {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][]A = new int [2][3];        
        int[][]B = new int [2][3];        
        
        System.out.println("First matrix number A =");
        for (int row = 0; row < 2; row++) {
        for (int col = 0; col < 3; col++) {
        A[row][col]=input.nextInt();
        }
        }
        System.out.println("A==");
          for (int row = 0; row < 2; row++) {
        for (int col = 0; col < 3; col++) {
        System.out.printf("  "+A[row][col]);
          }
                    System.out.println("");
        }
        
        System.out.println("First matrix number B =");{
        for (int row = 0; row < 2; row++) {
        for (int col = 0; col < 3; col++) {
        B[row][col]=input.nextInt();
        }
        }
      
      
        System.out.println("B==");
        for (int row = 0; row < 2; row++) {
        for (int col = 0; col < 3; col++) {
        System.out.printf("  "+B[row][col]);
       
        }
        
            System.out.println("\n");
      }
        System.out.print("A+B");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("  "+(A[row][col]+B[row][col]));
                
            }
            System.out.println(" ");
        }
        
        }    
        
    }
}