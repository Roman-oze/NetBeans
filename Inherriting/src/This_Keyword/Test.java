
package This_Keyword;


public class Test {
    String Name;
    int age;
    double height,weight;
    

Test(String name,int age,double height){
this.Name = name;
 this.age = age;
 this.height = height;

}
Test(String name,int age,double height,double weight){
this(name,age,height);
 this.weight = weight;

}


void display(){
    System.out.println("Name :"+Name);
    System.out.println("Age :"+age);
    System.out.println("Height :"+height);
    System.out.println("weight :"+weight);
    



}

}
