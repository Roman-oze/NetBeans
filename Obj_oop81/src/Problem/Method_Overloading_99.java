
package Problem;



public class Method_Overloading_99 {
        void add(int a,int b){
        
     System.out.println(a+b);
    
    }
    void add(double a,double b){

        System.out.println(a+b);
   
   }
    void add(int a,int b, int c){
   
        System.out.println(a+b+c);
    }
        
    void add(){
  
        System.out.println("Noting have:");
        
      

    }
    public static void main(String[] args) {
        
        Overloading_Test me = new Overloading_Test();
       
        me.add(20,40);
        me.add(20.12,40.87);
        me.add(20,30,50);
        me.add();
        
        
        
        
        
    }
    
}
