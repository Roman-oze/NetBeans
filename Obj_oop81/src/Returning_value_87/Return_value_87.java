
package Returning_value_87;


public class Return_value_87 {
    public static void main(String[] args) {
        
        //how get return value 
        
        Test return1 = new Test ();
        int div = return1.square(10);
        System.out.println("square value :"+div);
        
        
        //Second option get return value
        Test return2 = new Test();
        System.out.println("Square value :"+return2.square(20));
        
        
       Test rtn = new Test();
        int can = rtn.square1(10);
        System.out.println("The Result \t:"+can);
   
        
    }
}
