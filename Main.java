/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter 1st number :- ");
	    int num1 = input.nextInt();
	    
	    	System.out.print("Enter 2nd number :- ");
	    int num2 = input.nextInt();
	    
	    //Without user input number
	    
	   //for(int i =1; i<=num1; i=i+2){
	       
	   //    if(i==10){
	   //        continue;
	   //    }
	   //    System.out.println(i);
	   //}
	    
	    
	   // with user input number
	   
	   //	int sum=0;
	   // 	for(int i=1; i<=num1; i++){
	    	    
	   // 	    sum = sum +i;
	    	    
	   // 	    System.out.println(i+" The sum value :"+sum);
	   // 	}
	   
	   
	   //couple of user number input
	   
	   	int sum=0;
	    	for(int i=num1; i<=num2; i++){
	    	    
	    	    sum = sum +i;
	    	    
	    	    System.out.println(i+" The sum value :"+sum);
	    	}
		
		
	}
}
