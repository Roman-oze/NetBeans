
package string;


public class StringDemo_70 {
    
    public static void main(String[] args) {
        
        String r1 = "This_is_my laptop";
         System.out.println(r1);
        
        String r2 = r1.replace('s','t');
        System.out.println( "s will be exchange t = "+r2);
        
       String [] r3 = r1.split("_");
        for (String y :r3){
            System.out.println(" Create next line = "+y);
        }
            
        }
        
    }
    
    

