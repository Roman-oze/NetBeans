
package Problem;


public class problem_96_97 {
    
     double height,width,depth; //instan veriable 
    
    problem_96_97 (double h,double w,double d){ // short word local veriable
        
        height = h;  //instan veriable into local veriable
        width = w;  //instan veriable into local veriable
        depth = d;  //instan veriable into local veriable
        
        
      //  this.height =  height; // Instance Variable Hiding
      //  this.width = width;  // Instance Variable Hiding
      //  this.depth = depth; // Instance Variable Hiding
     }
    
   problem_96_97(){}

    public void volumeinformation(){ //how to use method

    double vol = height*width*depth; //took veriable then i make sub

     System.out.println("Valume is :"+vol);//print      
    }

    public static void main(String[] args) {


        problem_96_97 pro1 = new  problem_96_97(5,10,10);
        problem_96_97 pro2 = new problem_96_97(20,30,10);


        pro1.volumeinformation();
        pro2.volumeinformation();
       
        
        
        
        
        
        
        
        
        
        
        
     }
  
    
}

