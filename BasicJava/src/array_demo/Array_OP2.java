
package array_demo;

public class Array_OP2 {
    
    public static void main(String[] args) {
        
    
        
        int [][]num = new int [4][];
        
        int a = 0;
        num[0]= new int[1];
        num[1]= new int[2];
        num[2]= new int[3];
        num[3]= new int[4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <i+1 ; j++) {
             num[i][j]=a;
             a++;
            }
            
        }
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(" "+num[i][j]);
            }
             System.out.println("");
         }
        
        
        
    }
    
}
