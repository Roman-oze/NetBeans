
package string;

import java.util.Scanner;


public class Decimal_Convert77 {
    
    public static void main(String[] args) {
        
        
         // Without User input  =>  int Decimal; 
        // String Binary = Integer.toBinaryString(Decimal);
       // System.out.print("Binary number ="+Binary);
        
        
        Scanner input = new Scanner (System.in);
        
        int Decimal; 
        System.out.print("please enter decimal =");
        Decimal =input.nextInt();
        String Binary = Integer.toBinaryString(Decimal);
        System.out.print("Binary number ="+Binary);
        
        System.out.println("\n");
                
        
        int Decima = 15;
        System.out.print("Please enter hexa =");
        Decima =input.nextInt();
        String Hexa =Integer.toHexString(Decima);
        System.out.print("Hexa Number ="+Hexa);
        
        System.out.println("\n");
        
        int dec = 79;
        System.out.print("please enter Octal =");
        dec = input.nextInt();
        String Octal =Integer.toOctalString(dec);
        System.out.print("Octal number ="+Octal);
        
        
        System.out.println("\n");
        
        
        
        
        //String Binary = "10101";
       // Integer decimal = Integer.parseInt (Binary, 2);
       // System.out.println(""+decimal);
 
      //  int decimal = 121;
       // String hex = Integer.toHexString(mal);
       // System.out.println(" "+hex);
                
        
    }
    
}
