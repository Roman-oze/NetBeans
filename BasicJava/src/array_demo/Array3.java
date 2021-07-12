
package array_demo;

import java.util.Scanner;


public class Array3 {
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        
   String [] name = {"roman","sojib","saimob"};
    
 
    
    for (String x :name){
        
        
     System.out.println(x);  
    }
       
        
          int [][] num = new int [5][5];
          int a =0;
          
          for (int row = 0; row < 5; row++) {
              for (int col = 0; col < 5; col++) {
                  num[row][col]=a;
                  a++;
                  
              }
         
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.println(" "+num[row][col]);
                
            }
            
        }
        
        System.out.println(" ");
        
        
        
        int [][]number = new int [2][3];
        int sum =0;
        
        
        System.out.print("please enter any number =");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                number[row][col]=input.nextInt();
                
            }
            
        }
        
          
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println(" "+ number[row][col]);                
        
            }
       }   
        
        
        
        
        
        
        
        
    }
    
}
