
package if_else;

import java.util.Scanner;



public class Switch_2 {
    
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
        
        int nam,nam2,sum;
    
        
     String result ="color";
    
    
       
        System.out.print("Please Type Any number :");
        nam = input.nextInt();
        
        System.out.print("Please Type Any number :");
        nam2 = input.nextInt();
        
         System.out.print("Please enter any color :");
               result =input.next();
               
              
        
        sum = nam*nam2;
        System.out.println("Result :"+sum);
        
        sum = nam+nam2;
        System.out.println("Result :"+sum);
        
        
       if(nam>nam2){
           System.out.println("Possitive");
       }
       else if(nam<nam2){
           System.out.println("Negative");
       }
       else if(nam==nam2){
           System.out.println("Equal number");
       }
       else{
           System.out.println("We can't find this number");
       }
              
               
               switch(result){
                   
               
                   case "white":
                       System.out.println("#0000001");
                       break;
                       
                   case "black":
                       System.out.println(" we have this color #0000002");
                       break;
                       
                   case "blue":
                       System.out.println("we have this color#0000003");
                       break;
                       
                   case "red":
                       System.out.println("we have this color #0000004");
                       break;
                       
                   case "green":
                       System.out.println("we have this color#0000005");
                       break;
                       
                   case "pink":
                       System.out.println("we have this color #0000006");
                       break;
                       
                   case "yellow":
                       System.out.println("we have this color #0000007");
                       break;
                       
                   case "navyblue":
                       System.out.println("we have this color #0000008");
                       break;
                       
                   default :
                           System.out.println("Sorry it not avaiable here");
                                 
                       
                }
               

//        
//        res = nam+nam2;
//        System.out.println("jog :"+res);
//        
//        res = nam-nam2;
//        System.out.println("biyog :"+res);
//        
//        res = nam%nam2;
//        System.out.println("percent :"+res);
//        
//        
        
        
     
      
      
      
      }
        
        
        
        
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    

