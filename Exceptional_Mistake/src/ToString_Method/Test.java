
package ToString_Method;


public class Test {
    
    String name ;
     int age  ;

     Test(String name ,int age ){

      this.age = age;
      this.name = name;
       }
      Test(){}

    @Override
     public String toString(){

     return "Name : "+ name + "\n Age : "+age;
     }
}
