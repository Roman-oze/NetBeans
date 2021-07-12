
package pkginterface;


 public class Cat implements Animal {
    final String name =" Teddy" ;
  final int num = 20;
     
  
 Cat(){}
 
    @Override
    public  void Food(){
    
        System.out.println("cat name = "+name);
        System.out.println(" how many cat = "+num);
    }
    
}
