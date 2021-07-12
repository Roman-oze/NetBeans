
package super_key_call_const_meth;


public class Auto extends Bike{
 String distric;

 Auto(String m,String c,String d,double w){

     super(m,c,w);
    distric = d;
}

   
    

      
     void display57(){
       super.display();
       System.out.println("distric :"+distric);
    
    }
}
