
package if_else;

import java.util.Scanner;


public class Test {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int day = 7;
        String time ="";
        
        System.out.print("Day of weekend in 7:");
        day = input.nextInt();
        
        System.out.print("Time of shedule in 3 :");
        time = input.next();
        
        
        
        switch(day){
        
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
        }
                
      switch(time){
        
        case"1":
            System.out.println("Morning");
            break;
        case"2":
            System.out.println("Evening");
            break;
        case"3":
            System.out.println("Night");
            break;
        default:
            System.out.println("Not matching");
        }
        
       
        
        
        
        
        
        
        
        }
        
    }

