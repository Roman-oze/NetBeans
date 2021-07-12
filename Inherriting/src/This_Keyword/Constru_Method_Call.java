
package This_Keyword;

public class Constru_Method_Call {
 
    String name;
    int phone;
    double code;
    Constru_Method_Call(String n,int ph){
        this.name = n;
        this.phone = ph;
    }
    Constru_Method_Call(String n,int ph,double co){
        this(n,ph);
        this.code = co ;
    }
     void roman(){
    System.out.println("The name of here :"+name);
    System.out.println("This is the contact number :"+phone);
 }
     void islam(){
     this.roman();
         System.out.println("Code number :"+code);
     
     
     }
     
     
}
