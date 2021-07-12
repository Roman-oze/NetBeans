
package Overloading_Constructor_86;


public class Teacher {
    
    public static void main(String[] args) {
        
        Test teacher = new Test();
      
        System.out.println("\n");
        
        Test teacher2= new Test("Roman","male","brahmanbaria",24,1759676488);
           teacher2.DisplayInformation();
        
           System.out.println("\n");
           
        Test teacher3 = new Test("Roman","male","brahmanbaria");
      teacher3.DisplayInformation();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
