
package Problem;


public class Call_by_value_102 {
    
    public static void main(String[] args) {
        
        //Call By Value
        
        Test_102 obj = new Test_102();
        int x = 10;
        
        System.out.println("enter the x value :"+x);
        
        obj.change(x);
        System.out.println("show the x value :"+x);
        
        System.out.println("\n");
        
        
        //Call by Reference
        
        Test_102 rum = new Test_102();
        String name = "Roman";
        System.out.println(" After show name :"+name);
        
        
        //I used to Method 
        
        Test_102 rum1 =new Test_102();
       rum1.callbyreference(name);
        
        
        
    }
    
}
