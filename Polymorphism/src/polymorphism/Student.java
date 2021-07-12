
package polymorphism;


public class Student extends Person {
    
   final  int num = 211;
    
    Student(){}
   
    @Override
    void display(){
        //super.display();
        System.out.println("I'm an Student number =="+num);
    }
    
    
    
}
