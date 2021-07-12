
package super_key_call_const_meth;


public class Bike{
    String model,color;
   double weight;
    
     Bike (String m,String c,double w){
        model = m;
       color = c;
       weight = w;
    
    }
   
    void display(){
        System.out.println("model :"+model);
        System.out.println("color  :"+color);
        System.out.println("weight :"+weight);
    
    }
}
