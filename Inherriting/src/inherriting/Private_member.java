
package inherriting;

public class Private_member {
    public static void main(String[] args) {
       
        
        Test h1 = new Test();
        Test h2 = new Test();
        
       
        h1.information("Roman", "rumuislam303@gmail.com", "male", "hatijheel", 24, 1759676488);
         h2.information("Afroj", "afroj03@gmail.com", "female", "dhanmondi", 22, 1779686408);
       
        h1.display();
        System.out.println("\n");
        h2.display();
        
        
    }
}
