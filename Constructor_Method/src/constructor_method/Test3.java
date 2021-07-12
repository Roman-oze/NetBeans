

package constructor_method;


public class Test3 {
    
    String name,gender;
    int age,phone;
    
    Test3(){
        System.out.println("No value");
     }
    
    Test3 (String n,String g,int a){
    name = n;
    gender = g;
    age = a;
     
    }
    
    
    Test3 (String n,String g,int a, int p){
    
   
    name = n;
    gender = g;
    age = a;
    phone = p;
   
  
        
    }
    
    void displayInformation(){
    
        System.out.println("Test name "+name);
        System.out.println("Test Gender "+gender);
        System.out.println("Test age "+age);
        System.out.println("Test phone "+phone);
    
    
    
    
    }
    
    
    
    }
     

