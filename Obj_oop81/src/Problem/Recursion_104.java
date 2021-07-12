
package Problem;


public class Recursion_104 {
    
    int fact(int n){
    
        if(n==1)
          return 1 ;
        
        else  
           return n*fact(n-1);
            
        
    }
    
    
    public static void main(String[] args) {
       
       
        Recursion_104 req = new  Recursion_104();
        
         int result = req.fact(5);
         
         System.out.println("Result of Recursion :"+result);
        
         
         System.out.println("\n");
         
        int num = 5 , fact = 1 ;
        
        for (int i = 1; i <=num ; i++) {
        fact = fact*i;
        
        System.out.println(" 104,105,106 tuturial :"+fact);
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
