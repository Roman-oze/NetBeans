
package string;

public class String_Conver_Int75 {
   
    public static void main(String[] args) {
        
        int a = 100;
        String b = Integer.toString(a);
        System.out.println(" "+a);
        
        boolean c = true;
        String d = Boolean.toString(c);
        System.out.println(" "+d);
        
        double e = 200.35;
        String f = Double.toString(e);
        System.out.println(" "+f);
        
        float i = 20.3f;
        String j = Float.toString(i);
        
        System.out.println(" "+j);
        
       
        
        
        System.out.println(" ");
        
        //String Convert Integer,double,float,boolean
        
       String x = "32";
       Integer y = Integer.parseInt(x);
       System.out.println(" "+y);
        
       String m = "true";
       Boolean n = Boolean.parseBoolean(m);
       System.out.println(" "+n);
         
       String k ="40.58";
       Double h =  Double.parseDouble(k);
       System.out.println(" "+h);
       
       String o ="30.3";
       Float q = Float.parseFloat(o);
        System.out.println(" "+q);
       
    }
}
