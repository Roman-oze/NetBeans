
package Problem;


public class Abstraction {
    
    String name,place;
    int number,price;
    
     Abstraction(){
         System.out.println("---SUPERSHOP DESHBOARD---");
     }
    
    void market(String name,String place,int number,int price){
        
        this.name = name;
        this.place = place;
        this.number = number;
        this.price = price;
    }  
        void information(){
    
        System.out.println("product name :\t"+name);
        System.out.println("Location :\t"+place);
        System.out.println("Contact Us :\t"+number);
        System.out.println("product Rate :\t"+price);
        System.out.println("--------------------------");
    
    }
        
   public static void main(String[] args) {
        
       Abstraction rom = new Abstraction();
       rom.market("Shampoo", "Dhanmondi",1759676488, 250);
       rom.information();
       
       System.out.println("\n");
       
       Abstraction rom1 = new Abstraction();
       rom1.market("Facewash", "Gulshan",89389385, 550);
       rom1.information();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
 
}