/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherriting;

/**
 *
 * @author saifu
 */
public class Instanceof {
    public static void main(String[] args) {
        
       Animal a = new Animal();
    Teacher t = new Teacher ();
    person p = new person();
    
    
         
           System.out.println(a instanceof Animal);
           System.out.println(t instanceof Animal);
           System.out.println( p instanceof Teacher);
           System.out.println(t instanceof person);
           System.out.println(p instanceof Animal);
          
    }
}
