
package Access_Modifier;



public class A {
   
     //  import package and class name
    // must be use extends class name
       
   protected void display(){
        System.out.println("Hi Im Java learner");
        
   }  
   // Only for this class
   private void display1(){
        System.out.println("Hi Im Java learner");
        
   }  
   //whole class will be able to use this mothod
  public void display2(){
        System.out.println("Hi Im Java learner");
        
        
  }
}
