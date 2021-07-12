
package design1;

import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x ;
        int y ;
        int total;
        
        System.out.print("enter the  x number :");
        x = input.nextInt();
        
        System.out.print("enter the y number :");
        y = input.nextInt();
        
        total = x+y;
        System.out.print("result ="+total);
        System.out.println("\n");
        
        
    }
 
}
