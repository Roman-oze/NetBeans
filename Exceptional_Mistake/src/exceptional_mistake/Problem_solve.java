
package exceptional_mistake;


public class Problem_solve {
    
	int roll_no;
	 String name;
         
         Problem_solve(){}
          
	 Problem_solve (int roll_no, String name) {
             
		this.roll_no = roll_no;
		this.name = name;
	}
         
    public static void main(String[] args) {
       
		Problem_solve [] ary ;
                ary = new  Problem_solve [5];

		
		ary[0] = new  Problem_solve(1,"Roman");
                ary[1] = new Problem_solve(2,"Jarin");
                ary[2] = new Problem_solve(3,"Nidhi");
		ary[3] = new Problem_solve(4,"Israt");
		ary[4] = new Problem_solve(5,"Muskan");

		
		for (int i = 0; i < ary.length; i++)
		System.out.println(" University " + i + " : " +
		ary[i].roll_no +" "+ ary[i].name);
	}
}

    

