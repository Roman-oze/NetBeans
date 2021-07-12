
package string_package;

public class String_demo68 {
    
    public static void main(String[] args) {
        
        String [] name  ={"Bangladesh","India","Pakistan","China"}; 
        
        for (int i = 0; i < 4; i++) {
            System.out.println(i+" "+name[i]);            
        }
        System.out.println("");
        
    String [] names  ={"Bangladesh","India","Pakistan","China"}; 
        
        for (String x : names) {
            for (int i = 0; i < 10; i++) {
                
            }
              System.out.println(" "+x);  
            }
          
               System.out.println(""); 
            
       
        
     
        
        String firstname = "Roman";
        String lastname = " Islam";
        
        String fullname = firstname + lastname;
        //without can do like this 
        
       System.out.println("Full Name = "+fullname);
        
       String toUpperCase = fullname.toUpperCase();
        System.out.println("All of Capital word = "+toUpperCase);
        
       String toLowerCase = fullname.toLowerCase();
        System.out.println("All of small word = "+toLowerCase);
       
      boolean a = firstname.startsWith("R");
        System.out.println("First word = "+a);
        
        
        boolean b = lastname.endsWith("m");
        System.out.println("Last Word = "+b);
        
        
        boolean c = firstname.contentEquals(lastname);
        System.out.println("full name of same or no = "+c );
        
        
        
        
        
        
        
        
        
}
}  
        
    

