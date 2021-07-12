
package exceptional_mistake;


public class Exceptional_Mistake {

   
    public static void main(String[] args) {
        //Try
        //Catch
        //Finally
        //Excetional problem solve signal
      
        
        try {
            
        int x =20;
        int y =0;
        int result;
        result = x/y;
         System.out.println(" Arithmetic result =" +result);
     }
        catch (Exception e){
            System.out.println("Excetional problem ="+e);
        
        }
        finally{
            
        System.out.println(" we are trying to solve this problem");
        
        }
       
        
    }
    
}
