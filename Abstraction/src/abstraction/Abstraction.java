
package abstraction;


public class Abstraction {

    
    public static void main(String[] args) {
       
        MobileUser mu;  //Abstraction not = MobileUser mu = new MobileUser();
        //must be have to use referance --> mu 
        
        mu = new Roman();
        mu.sendmessage();
        
        mu = new Islam();
        mu.sendmessage();
    }
    
}
