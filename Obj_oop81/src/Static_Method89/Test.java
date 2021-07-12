
package Static_Method89;


public class Test {
    
    String name;
    int id;
    static String Universityname = "Daffodil international university";
    
   
   
   
   Test(String n,int i){
   
       name = n;
       id = i;
   
   }
   
   
   void displayinformation(){
       System.out.println("Studen name :"+name);
       System.out.println("Student Id :"+id);
       System.out.println("University name :"+ Universityname);
       
   
   
   }
   //this is return value
   
   int square (int value){
   
   return value+value;
   }
   
   
   
   
}
