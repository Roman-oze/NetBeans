
package ToString_Method;


public class String_comparison {
    public static void main(String[] args) {
        
        String password1 = "roman123";
        String password2 = "Roman123";
        String password3 = "roman123";
        
        String password4  = new String("islam123");
        String password5  = new String("roman23");
        String password6  = new String("islam123");
        
        //here three way to convert equal string
        
        System.out.println(password1.equalsIgnoreCase(password3));
        
        System.out.println(password1==password3); //true
        System.out.println(password3==password5); //false
        System.out.println(password2==password6); //false
       
        System.out.println("\n");
        
       System.out.println( password6.equals(password4)); //true       System.out.println( password5.equals(password2)); //true
       System.out.println( password4.equals(password1)); //flase
       System.out.println( password5.equals(password3)); //false
        
    }
}
