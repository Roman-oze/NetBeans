
package array_demo;


public class Array_OP1 {
    
    public static void main(String[] args) {
        
        
        int [][]num = new int [4][5];
        
        int a = 0;
       
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5 ; j++) {
             num[i][j]=a;
             a++;
            }
            
        }
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(" "+num[i][j]);
            }
             System.out.println("");
         }
        
        
        
        
        
        
        
        
        
    }
    
}
