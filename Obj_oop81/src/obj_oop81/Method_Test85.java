
package obj_oop81;


public class Method_Test85 {
    
    String name ,gender,location;
    int age,phone;
    
    
    
    //Directly main method
     Method_Test85(String n,String g,String l, int a,int ph){
     
   name = n;
   gender = g;
   location = l;
   age = a;
   phone = ph;
    
    }
   
     
     Method_Test85(String n,String g,String l){
     
     name = n;
   gender = g;
   location = l;
     }
    
   
     
    Method_Test85(){
        System.out.println("No Value");
    }
    
    
  //void indireectly call method
  void setInformation(String n,String g,String l, int a,int ph){
    
   name = n;
   gender = g;
   location = l;
   age = a;
   phone = ph;
    }
    
   
   //void indireectly call method
    void displayInformation(){
    
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("location :"+location);
        System.out.println("age :"+age);
        System.out.println("phone :"+phone);
}
}