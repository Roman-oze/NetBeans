

package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
        
      Person p = new Person ();
      p.display();
 
      
      Person s = new Student();
      s.display();
      
//       Student s = new Student();
//      s.display();
      
      
      Person t = new Teacher ();
      t.display();
      
      Person t1 = new Teacher ();
      t1.display();
      
      
//     Teacher t = new Teacher ();
//      t.display();
//        
    }
    
}
