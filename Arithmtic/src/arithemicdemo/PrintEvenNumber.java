
package arithemicdemo;

import java.util.Scanner;


public class PrintEvenNumber {
 
    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        int sum = 1;
        int m,n;
      
       System.out.println("first point number =");
       m = input.nextInt();
     
      
        System.out.println("Second point number =");
       n= input.nextInt();
      
      
      
        for (int i = m; i <=n; i++) {
            sum = sum + i;
             
        }
       System.out.println("inisalization "+sum);
        
    }
    
    
    
    
}
