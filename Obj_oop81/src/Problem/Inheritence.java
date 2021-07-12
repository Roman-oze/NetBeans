
package Problem;

public class Inheritence {
    
 int pid,price;
 String name,brand;
 
   Inheritence(){
       System.out.println("The product information");
  }
 
  void setmenu(int pid ,String name,String brand,int price){
     
     this.pid = pid;
     this.name = name;
     this.price = price;
     this.brand = brand;
   
 }
    void infodetails(){
        
        
        System.out.println("<I'D>:\t"+pid);
        System.out.println("product Name:\t"+name);
        System.out.println("product Price:\t"+brand);
        System.out.println("product Price:\t"+price);
          System.out.println("============================");
        
 }
 
 
    public static void main(String[] args) {
    
       Inheritence obj = new Inheritence();
       obj.setmenu(201, "Iphone 7Plus", "Apple", 65000);
       obj.infodetails();
       
        System.out.println("\n");
        
        Inheritence obj1 = new Inheritence();
        obj1.setmenu(305, "Apex", "XP", 2400);
        obj1.infodetails();
        
        System.out.println("\n");
     
       Inheritence obj2 = new Inheritence();
        obj2.setmenu(405, "Dell", "Microssoft",35999 );
        obj2.infodetails();
     
        
      
    }
    
}