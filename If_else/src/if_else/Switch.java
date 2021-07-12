
package If_else;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int day = 7;
        
        System.out.print("Enter Any number :");
        day = input.nextInt();
        
        switch(day) {
    
   
            
        case 1:
            System.out.println("Saturday");
            break;
            
        case 2:
            System.out.println("Sunday");
            break;
            
        case 3:
            System.out.println("Monday");
            break;
            
        case 4:
          System.out.println("Tuesday");
            break;
            
        case 5:
          System.out.println("Wednesday");
            
        case 6:
            System.out.println("Thursday");
            break;
        
        case 7:
            System.out.println("Friday");
            break;
            
    
        default :
                System.out.println("OFF DAY");
                
    
    
    
    
    
    
    
    
    
    }
                
        
        
        
    }
}
