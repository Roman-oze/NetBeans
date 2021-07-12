
package string;


public class String_Demo69 {
    public static void main(String[] args) {
        
        String  country = "Bangladesh is our country";
        System.out.println(country);
        
        
        
        char cha = country.charAt(20);
        System.out.println(" 20 number word count  ="+cha);
        
        
        
        
        int pos = country.indexOf('g');
        System.out.println("first word where ="+pos);
        
        
      int  pos1 = country.lastIndexOf('l');
        System.out.println("last word where ="+pos1);
        
        
        int pos2 = country.codePointBefore(1);
        System.out.println(" a word value count ="+pos2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
