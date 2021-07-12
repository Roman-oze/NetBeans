
package transprotdemo;

import java.util.Scanner;


public class VowelDemo {

    
    
    public static void main (String[]args){
    
    Scanner input = new Scanner (System.in);
    
    char ch;
    System.out.print("ENTER THE ANY LETTER  :");
   ch = input.next().charAt(0);
   
   
   if (ch == 'a'  ||   ch == 'e' || ch  == 'i' || ch == 'o' || ch == 'u'){
   System.out.print("vowel --->");
  

   }
    
   else {
        System.out.print("Consonant");
           } 
    
    
    
    
    }  
    
    
    
    
    
}
