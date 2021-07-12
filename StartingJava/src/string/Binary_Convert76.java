
package string;


public class Binary_Convert76 {
    public static void main(String[] args) {
        
        //Decimal thake Binary,Octal,Hexadecimal ber korar way//
        
        
        String Binary ="10101";
        Integer decimal = Integer.parseInt(Binary, 2);
        System.out.println(" Decimal number = "+decimal);
        
        
        
        String Octal ="67";
        Integer Dc = Integer.parseInt(Octal, 8);
        System.out.println(" Decimal number = "+Dc);
        
        
         String hexa ="aa";
        Integer dl = Integer.parseInt(hexa, 16);
        System.out.println("Decimal number = "+dl);
        
    }
    
    
}
