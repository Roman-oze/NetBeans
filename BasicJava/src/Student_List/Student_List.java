
package Student_List;

import java.util.LinkedList;

public class Student_List {
    
    public static void main(String[] args) {
        
        LinkedList <Test> obj = new LinkedList <Test>();
        
        Test std1 = new Test(43,"Roman","2nd semester");
        Test std2 = new Test(44,"Zannat","3rd semester");
        Test std3 = new Test(45,"Jarin","4th semester");
        Test std4 = new Test(46,"Misty","5th semester");
        
        System.out.println(std1.id+" "+std1.name+" "+std1.class_name);
        System.out.println(std2.id+" "+std2.name+" "+std2.class_name);
        System.out.println(std3.id+" "+std3.name+" "+std3.class_name);
        System.out.println(std4.id+" "+std4.name+" "+std4.class_name);
       
            
        }
          
            //Second option we can use this wa
        
        
        
//        obj.add(std1);
//        obj.add(std2);
//        obj.add(std3);
//        obj.add(std4);
//        
//        for(Test p : obj)
//            
//            System.out.println(p.id+" "+p.name+" "+p.class_name);
//        
        
       
        
    }

