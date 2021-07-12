
package design;

import java.util.Scanner;
public class One {
              
  protected void display1(){
   
   System.out.println("Hello World");
   }
   
   public void display(){
   
   System.out.println("hi");
   }
    public static void main(String[] args) {

    
        Scanner input = new Scanner(System.in);

    
     
        
        System.out.println("---Water compnay---");
     
    final String name ="       Spa";
    int water=0;
    int coke= 0;
    int result;
    
        System.out.println(name);
           
    
   System.out.print("Enter the water price :");
   water = input.nextInt();
   
   System.out.print("Enter the coke price :");
   coke = input.nextInt();
   
  
   result =  water + coke;
   System.out.println("Total Cost = "+result);
  
    
  
  
        

    }
}
