
package array_demo;


public class For_Each_Loop {
    
    public static void main(String[] args) {
        
       String [] name ={"roman","islam","rumu","romon"};
    
       
       for (String x : name ){
   
           System.out.println(x);
       }
       
       
       
       
      
       int []num ={10,20,30,40,50,60,70,80,90,100};
       
       int sum =0;
       
        for (int i : num) {
            
            sum = sum +i;
        }
       
    
        System.out.println("totall results ="+sum);

    
    
    } 
}
