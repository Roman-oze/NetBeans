
package Interface;


public class Gender implements Boy,Girl{
     final String name =" Roman Islam" ;
     final String name1 =" Jerin" ;
  final int age = 16;
  final int age1 = 23;
     
  
 Gender(){}
     @Override
        public void run(){
            System.out.println("Name ="+name);
             System.out.println("Age ="+age);
             System.out.println("\n");
             System.out.println("Name ="+name1);
            System.out.println("Age ="+age1);
        }

    
}
