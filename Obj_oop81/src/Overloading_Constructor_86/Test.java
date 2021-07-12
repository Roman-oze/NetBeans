

package Overloading_Constructor_86;


public class Test {
    
    //prothome veriable dite hbe
    String name,gender,location;
    int age,phone;
    
    
    //constructor method main class test likhle data gula oikhne show korbe
    Test(){
        System.out.println("No Information");
    }
    
    
                //Second constructor method
       Test(String n,String g,String l,int a,int ph){
    
        name = n;
        gender = g;
        location = l;
        age = a;
        phone = ph;
    
    }
    
    //Third constructor method
    Test(String n,String g,String l){
    
    name = n;
    gender = g;
    location = l;
    
    }
    
    void DisplayInformation(){
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("location :"+location);
        System.out.println("age :"+age);
        System.out.println("phone number :"+phone);
    
    
    }    
    
    
    
    
    
    
    
    
}