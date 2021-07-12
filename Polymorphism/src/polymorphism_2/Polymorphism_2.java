
package polymorphism_2;


public class Polymorphism_2 {
    public static void main(String[] args) {
        
         Shape_Area s = new  Shape_Area();
         Rectangle r = new Rectangle(20,40);
         Traingle t = new Traingle(30,40);
         
//         s.area();
//         r.area();
//         t.area();
         System.out.println("Shape_Area :"+s.area());
         System.out.println("Rectangle :"+r.area());
         System.out.println("Traingle :"+t.area());
         
    }
}