
package arithemicdemo;

import java.util.Scanner;


public class Series {
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.print("enter the first value =");
        n =input.nextInt();
        
        
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+"X"+i);
           sum =sum+i*i;
        }
        
        System.out.println("Answer ="+sum);
            
        }
        
        
        
        
        
    }

