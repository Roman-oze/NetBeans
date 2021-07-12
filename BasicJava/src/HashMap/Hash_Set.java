
package HashMap;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        
          HashSet <String> obj = new HashSet <String>();
        obj.add("Roman");
        obj.add("Jarin");
        obj.add("Bristy");
        
//        obj.remove("Roman");
        System.out.println("Name :"+obj);
//        
      
        System.out.println("size  :"+obj.size());
        
        obj.clear();
        System.out.println(obj);
        
         boolean value = obj.isEmpty();
         System.out.println("value :"+value);
         
        
        boolean value1 = obj.add("Roman");
        System.out.println("value :"+value1);
        
    }
 
}
