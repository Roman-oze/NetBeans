
package polymorphism_2;


public class Rectangle extends Shape_Area{
    
    double lenth,weith;
    
    Rectangle (double len,double wei){
    this.lenth = len;
    this.weith = wei;
    
    }
    
    
    
  
   double area(){
       
   return  lenth*weith;
     
           
   } 
}
