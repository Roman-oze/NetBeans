
package string;


public class String_Demo71 {
    
    public static void main (String []args){
    
        String r1 = "Roman";
    StringBuffer ro = new StringBuffer("Roman");
        System.out.println(""+ro);
        
        
        
        ro.append(" Islam");
        System.out.println(" "+ro);
        
        
        
        ro.delete(0,5);
        System.out.println(" "+ro);
    
    
        ro.setLength(5);
        System.out.println(" "+ro);
    
    
    
    
    
    
    
    
    
    
    }
    
}
