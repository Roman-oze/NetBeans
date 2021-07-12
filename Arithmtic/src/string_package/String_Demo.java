
package string_package;


public class String_Demo {
    
    public static void main(String[] args) {
      
       
          
       String [] name ={"1.Roman","2.Islam","3.Rumu","4.Romon"};
    
       
       for (String x : name ){
   
           System.out.println(x);
       }
        
        String a ="Roman Islam";
        System.out.println(a);
    
        String a1 = new String ("Roman Islam");
        System.out.println(a1);
        
        char [] a2 ={'R','O','M','A','N'};
        System.out.println(a2);
     
        int len = a1.length();
        System.out.println("length number ="+len);
        
        if(a.equals(a1)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        
        if(a.equals(a2)){
        
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        
        boolean result = a1.isEmpty();
        System.out.println("The Result =   "+result);
        
       
        
        
        boolean b = a.equalsIgnoreCase("a1");
        System.out.println(" b Result =   "+b);
       
        
        boolean c = a.contentEquals("a1");
        System.out.println(" c Result =   "+c);
        
        
        
        
        
    }
}