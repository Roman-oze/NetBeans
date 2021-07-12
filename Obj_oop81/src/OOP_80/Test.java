
package opp_80;


public class Test {
    
    public static void main(String[] args) {
     
        Teacher_80 teacher1; // veriable   
        
        teacher1 = new Teacher_80();
        teacher1.name = "Roman Islam";
        teacher1.gender = "Male";
        teacher1.location = "Hatijheel";
        teacher1.age = 24;
        teacher1.number =+1759676488;
        
      
        System.out.println("Teacher1 Object Name: "+teacher1.name);
        System.out.println("Teacher1 Object Gender: "+teacher1.gender);
        System.out.println("Teacher1 Object Location: "+teacher1.location);
        System.out.println("Teacher1 Object Age: "+teacher1.age);
        System.out.println("Teacher1 Object Number: "+teacher1.number);
        
        System.out.println("\n");
        
        
        Teacher_80 teacher2;   // veriable   
           
        teacher2 = new Teacher_80();
        teacher2.name = "Sadia Afroz";
        teacher2.gender = "feMale";
        teacher2.location = "Dhanmondi";
        teacher2.age = 21;
        teacher2.number =+1755823488;
        
       
        System.out.println("Teacher2 Object Name: "+teacher2.name);
        System.out.println("Teacher2 Object Gender: "+teacher2.gender);
        System.out.println("Teacher2 Object Location: "+teacher2.location);
        System.out.println("Teacher2 Object Age: "+teacher2.age);
        System.out.println("Teacher2 Object Number: "+teacher2.number);
    }
    
}
