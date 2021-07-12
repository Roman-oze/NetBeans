
package Final_Keyword;

public class B extends A{
    
   static final String number ;
    //final String number = "211-51-043";
    
// B(String n,int a ,double num){
//   super(n,a);
//   this.number = num;
//}
    static{
    number = "211-51-043";
    }
B(){}
  //@Override
void display2(){
        System.out.println("id number +"+number);
}

}