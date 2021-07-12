
package obj_oop81;


public class Method_Test83 {
    
     
    //constructor er name exacetly class er name hote hbe 
    String name ,gender,location;
    int age,phone;
    
    
    
    
  // method e je kono nam dewa jabe
    void setInformation(String n,String g,String l, int a,int ph){
    
   name = n;
   gender = g;
   location = l;
   age = a;
   phone = ph;
    }
    
    
    
    
    
    
    
    
    void displayInformation(){
    
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("location :"+location);
        System.out.println("age :"+age);
  
        
        System.out.println("phone :"+phone);
    }
}
