
package arithemicdemo;

import java.util.Scanner;


public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("single loop work dont forget that");
        int num;
        System.out.print("multiplication =");
        num = input.nextInt();
        
        for (int i =1; i <=10 ; i++){
        
            System.out.println(num+" X "+i+"="+num*i);        
        
        }
        
    }
    
}
