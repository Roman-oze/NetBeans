
package Problem;


public class Test1 {
    
    
     double height,width,depth;
    
    Test1(double h,double w,double d){
        
        height = h;
        width = w;
        depth = d;
      }
    
    void volumeinformation(){
        double vol = height*width*depth;
        System.out.println("Valume is :"+vol);
    
    }
    
}
