
package string_package;


public class String_Demo72 {
    public static void main(String[] args) {
        
        
        String sb = "roma";
        StringBuffer sb1 = new StringBuffer(sb);
        
       String sb2 = sb1.reverse().toString();
     
        if (sb.equals(sb2)) {
            System.out.println("Plindrome");        
        }
        else{
            System.out.println("Not Plindrome");
        }
        
        
        
        
        
        
        
        
        
    }
}
