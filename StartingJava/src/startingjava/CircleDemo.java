
package startingjava;

import java.util.Scanner;

public class CircleDemo {
    
    public static void main (String[]args){
        
        
        Scanner input = new Scanner (System.in);
        
        double radius, area;
        
        
        System.out.print("Enter the radius :");
        radius = input.nextDouble();
        
        area = 3.123 * radius * radius;
        
        System.out.print("area of the circle ="+area);
        
        
        
        
    }
    
}
