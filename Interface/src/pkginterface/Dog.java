
package pkginterface;


public  class Dog implements Animal {
    
    final double weight = 23 ;

     
    Dog( String n,int num , double we){
        //super(n,num);
       //this.weight = we;
     
    }
    Dog(){}

  public void Food(){
  
      System.out.println("Dog weight = "+weight);
  
  }
   
}
