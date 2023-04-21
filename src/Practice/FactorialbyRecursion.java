package Practice;

public class FactorialbyRecursion {
	
	static int fact=1;
	public static void main(String[] args) {
		int no=5;
		FactorialbyRecursion ob= new FactorialbyRecursion();
		ob.calFact(no);
		System.out.println("factorial of " + no + " is " + fact);
		
		
	}
   void calFact(int no) {
	   if(no>=1) {
		   fact=fact*no;
	           calFact(no-1);
	   }
	  
   }
}
