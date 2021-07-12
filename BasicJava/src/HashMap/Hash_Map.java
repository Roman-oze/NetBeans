
package HashMap;
import java.util.HashMap;
public class Hash_Map {
    public static void main(String[] args) {
        
        HashMap <Integer,String> obj = new HashMap <Integer,String>();
         
          obj.put(10, "Roman");
          obj.put(20, "Islam");
          obj.put(30, "Jarin");
          
          System.out.println(""+obj.get(30));
          System.out.println(""+obj.get(20));
          System.out.println(""+obj.get(10));
          
          
          System.out.println("");
           
        HashMap <String,Integer> ob = new HashMap <String,Integer>();
        
          ob.put("Bangladesh",2020);
          ob.put("Canada",2021);
          ob.put("America",2022);
          
          System.out.println("Country :"+ob.get("Bangladesh"));
          System.out.println("Country :"+ob.get("America"));
          System.out.println("Country :"+ob.get("Canada"));
           
          
          
          
          
          
    }
}
