
package Type_Casting;


public class Test {
    public static void main(String[] args) {
        
        //Double to Int convert
        double x = 10.00 ;
        float y = (float) x;
        
        //Int to double conver
        int a = 20;
        double b = a;
        
        System.out.println("Subraction = "+y);
        System.out.println("Subraction = "+b);
        
        System.out.println("\n");
        
        Person obj = new Person();
        obj.display();
        
        Teacher obj1 = new  Teacher();
        obj1.display1();
        
        
        
    }
 
}
