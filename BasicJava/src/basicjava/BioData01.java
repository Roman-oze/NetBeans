 
package basicjava;

import java.util.Scanner;


public class BioData01 {
    
    
    public static void main(String []args){
    
     Scanner input =new Scanner (System.in);
   
       
       int x=2;
       int y=3;
      
       System.out.println("Enter the value :-");
       x =input.nextInt();
       
       
       
     x+=y; //  x= x+y=5
      System.out.println("x ="+x);
       
               
       System.out.println("Enter the value :-");
       x =input.nextInt();
       
     x-=y; //  x= x-y=2
      System.out.println("x ="+x); 
      
       
       System.out.println("Enter the value :-");
       x =input.nextInt();
       
     x*=y; //  x= x*y=6
      System.out.println("x ="+x);
      
       
       System.out.println("Enter the value :-");
       x =input.nextInt();
       
     x/=y; //  x= x/y=2
      System.out.println("x ="+x);
      
      
       System.out.println("Enter the value :-");
       x =input.nextInt();
       
     x%=y; //  x= x%y=2
      System.out.println("x ="+x);
      
      
      
       
       System.out.println("result of X:-"+x);
      
    }
    
}
