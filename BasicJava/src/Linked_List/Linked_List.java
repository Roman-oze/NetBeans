
package Linked_List;

import java.util.LinkedList;


public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        
        obj.add("Bangladesh");
        obj.add("China ");
        obj.add("Canada");
        obj.add("Swezerland");
        obj.add("Australia");
//      obj.addFirst("Italy");
//      obj.addLast("America");
//      obj.remove(3);
//      obj.remove(4);
        //obj.size();
   
      
     
        System.out.println("get string = "+obj.getFirst());
        System.out.println("get string = "+obj.getLast());
        
        
        for (String country : obj) {
           System.out.println("My favorite country here : "+country);
          
        }
           System.out.println("Linked list size :"+obj.size() );
            obj.clear();
            System.out.println("Clear unnessary "+obj);
      
 
    }
 
}
