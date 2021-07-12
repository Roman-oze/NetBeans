/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_80;

/**
 *
 * @author saifu
 */
public class Test_84 {
    
 String name,location,gender;
    int age,number;
           
  
   Test_84(){
       System.out.println("No Value");
   }
    
   
   Test_84(String n,String g,String l,int a){
       
       name = n;
       gender = g;
       location = l;
       age = a;
   
   
   }
   
   
   
    Test_84(String n,String g,String l,int a,int ph){
    
       name = n;
       gender = g;
       location = l;
       age = a;
       number = ph;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
     void displayinformation (){
    
        System.out.println("Teacher Object Name: "+name);
        System.out.println("Teacher Object Gender: "+gender);
        System.out.println("Teacher Object Location: "+location);
        System.out.println("Teacher Object Age: "+age);
        System.out.println("Teacher Object Number: "+number);
    
    
     }
}
