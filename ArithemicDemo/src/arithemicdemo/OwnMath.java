
package arithemicdemo;

import java.util.Scanner;

public class OwnMath {
  
    public static void main (String[]args){
        
    Scanner input = new Scanner (System.in);
    
 double base,height,area;
  
        System.out.print("The first base =");
       base =input.nextDouble();
        
        System.out.print("The second value =");
       height =input.nextDouble();
        
       
       area = (0.5*base*height);
        System.out.println("The triangle value ="+area); 
    
        
         
                int a=1;
                do{
                
            System.out.println(a+" Hello Iam Roman");
            a++;
                    
                }while (a<=20);
    
    
    
    
    
    }
}
