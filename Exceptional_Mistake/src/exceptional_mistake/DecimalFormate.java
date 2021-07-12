
package exceptional_mistake;

import java.text.DecimalFormat;


class DecimalFormate {
    public static void main(String[] args) {
        
        
         double x = 9.34583; 
       
        System.out.printf("x =%.2f",x);

        
        
        System.out.println("\n");
        
        
        
       DecimalFormat obj = new  DecimalFormat ("0.00");
       
      double y = 9.34583; 
      
        System.out.println(" X print value :"+obj.format(y));
        
        
        System.out.println("\n");
        
         DecimalFormat ob = new  DecimalFormat("000.00");
         
        int a = 3494;
        
        System.out.println("A value integer :"+ob.format(a));
        
        
    }

 
}
