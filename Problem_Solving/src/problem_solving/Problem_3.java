
package problem_solving;

import java.util.HashMap;

public class Problem_3 {
    
    public static void main(String[] args) {
       
       
     HashMap <String,Integer> obj = new HashMap <String,Integer>();
    
     
    
     obj.put("Roman",30);
     obj.put("Romo",60);
     obj.put("jarin",50);
     obj.put("jannat",40);
     
        System.out.println("People Name :"+obj.get("Roman"));
        System.out.println("People Name :"+obj.get("jarin"));
        System.out.println("People Name :"+obj.get("jannat"));
        
        System.out.println("\n");
     
      HashMap <Integer,String> obj1 = new HashMap <Integer,String> ();
                 
     obj1.put(3020,"Canada");
     obj1.put(6050,"Italy");
     obj1.put(5040,"Spain");
     obj1.put(4030,"Japan");
     
        System.out.println("Country Name :"+obj1.get(3020));
        System.out.println("Country Name :"+obj1.get(6050));
        System.out.println("Country Name :"+obj1.get(4030));
        
        
       
        
       
        
        
    }
    }
