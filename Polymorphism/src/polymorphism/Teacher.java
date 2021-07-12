
package polymorphism;


public class Teacher extends Student{
    
    final String mail="rumu@gmail.com";
    
   Teacher(){} 
    @Override
    void display(){
        //super.display();
        System.out.println("I'm Teacher  =="+mail);
    }
}
