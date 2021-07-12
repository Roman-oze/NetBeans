
package arithemicdemo;

import java.util.Scanner;


public class Multiplocation2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       int m,n;
        System.out.print("first iniliza number =");
        m = input.nextInt();
        
        System.out.print("Any multiplication number =");
        n = input.nextInt();
        
        for (int i = m; i <=n; i++ ) {
            
   System.out.println("\n \n");
   
            for (int j = 1; j <=10; j++) {
                
                   System.out.println(i+" X " +j+ " = " +i * j);  
            }
       
            System.out.println("\n \n");
        }
  
        
        
        
        
    }
    
}
