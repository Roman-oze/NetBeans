
package polymorphism_2;


public class Traingle extends Shape_Area{
    double base,height;
    
     Traingle(  double base,double height){
         this.base = base;
         this.height = height;
         
     }    
 
     double area(){
      
        return 0.5*base*height;
    
     }
    
}
   