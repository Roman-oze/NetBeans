
package If_else;


import java.util.Scanner;

public class If_else {

    public static void main(String[] args) {
        
      
     Scanner input = new Scanner(System.in);
        int num1,num2,result;
       
        System.out.print("please Enter any first number :");
        num1 = input.nextInt();
        
        System.out.print("please Enter any second number :");
        num2 = input.nextInt();
        
        
        
       if(num1>num2){
          
           System.out.println("number one is big :");
           result = num1+num2;
           System.out.println("Sum =="+result);
       } 
       else if (num1<num2){
       
           System.out.println("number second is big :");
            result = num1+num2;
           System.out.println("Sum =="+result);
       }
       
       
       
       else if (num1==num2){
       
           System.out.println("Same number :");
            result = num1+num2;
           System.out.println("Sum =="+result);
       }
       
       else {
        System.out.println("Not matiching number :");
         result = num1+num2;
           System.out.println("Sum =="+result);
       }
       
        
       
       
//        
//       if(num2>0){
//           System.out.println("number one is big");
//       } 
//       else if (num2<0){
//       
//           System.out.println("Zero is big :");
//       }
//       else if (num2==0){
//           System.out.println("zero");
//       }
//       
//       else {
//        System.out.println("no matiching number :");
//       }
//       
//       
   }
    
}
