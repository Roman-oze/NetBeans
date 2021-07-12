
package arithemicdemo;

import java.util.Scanner;


public class PrimeNumberMtoN {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
                
          int m,n;
          int count=0;
          System.out.print("Enter the first number =");
          m =input.nextInt();                
                
          System.out.print("Enter the first number =");
          n =input.nextInt();         
                
           for(int i=m; i< n; i++){
               
               
               for (int j =1; j < i-1; j++) {
                   if(i%j==0){
                       count++;
                       break;
                       
                       
                       
                   }
        if (count==0){
        
            System.out.println(i);
        }           
                   
                   
           count=0;        
                   
                   
               }
    
          
    
    }     
                
                
                
                
                
                
                
                
                
                
                
                }
    
}
