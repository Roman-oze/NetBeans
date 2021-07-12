
package arithemicdemo;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in); 
     
        int n,result=1;
        System.out.print("Enter the simbol number =");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i=i+2) {
            System.out.print(i+"  ");
            
            result = result * i;
            System.out.println(result);
           
            int a=1;
            int b=2;
            System.out.println(" opearator =");
             b = input.nextInt();
             
            a+=b;
            System.out.println("Addition ="+a);
            
            a-=b;
            System.out.println("subtraction ="+a);
            
            a*=b;
            System.out.println("multiplication ="+a);
            
            
            
            
            
             
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
  
    
    
    
    
    
    
    
    
    
    
    
}
