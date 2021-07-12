
package problem_solving;

import java.util.Scanner;

public class Problem_Solving {

   
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Please Enter any word :");
        char wod = input.next().charAt(0);
        
        if (wod == 'a') {
            System.out.println("Vowel Word :"+wod);
          }
       
        else if(wod == 'e'){
          System.out.println("Vowel Word :"+wod);
        }
        
       
        else if(wod == 'i'){
          System.out.println("Vowel Word :"+wod);
        }
        
       
        else if(wod == 'o'){
          System.out.println("Vowel Word :"+wod);
        }
        
       
        else if(wod == 'u'){
          System.out.println("Vowel Word :"+wod);
        }
        
        else{
            System.out.println("Consonent Word "+wod);
        }
    }
    
}
