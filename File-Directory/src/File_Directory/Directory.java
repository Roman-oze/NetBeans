
package File_Directory;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        
        //create file
        File file = new File("C:/Users/saifu/Desktop/maket");
       file.mkdir();
       System.out.println(file);   
        
        File obj = new File("Person");
        File obj1 = new File("Teacher");
        
      
//      obj.createNewFile("Small");
//        obj1.createNewFile("big");
//            System.out.println("create new file "+obj);
//        
      
       
        
         
       // fine file location
       
       //File file = new File("market");
        file.mkdir();
        String filelocation = file.getAbsolutePath();
       System.out.println(filelocation);
         System.out.println(file.getName());
  
      if(file.delete()){
            System.out.println(file.getName()+"File has deleted ");
        }
        
     
        
    }
}
