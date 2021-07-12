
package overloading_method;


public class Teacher extends Person {
    
    String Qualification,location;
    int code;
    
    @Override
   void information(){
       
       System.out.println("Name :"+name);
       System.out.println("Email :"+email);
       System.out.println("I'D Number :"+id);
       System.out.println("Age :"+age);
       System.out.println("Qualification :"+Qualification);
       System.out.println("location :"+location);
       System.out.println("Code :"+code);
  
   }
   
}
