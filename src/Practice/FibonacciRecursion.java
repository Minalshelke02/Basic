package Practice;

public class FibonacciRecursion {

	static int a=0, b=1 ,c;
	
	public static void main(String[] args) {
		
		System.out.print(a+ " " +b);
		FibonacciRecursion ob=new FibonacciRecursion();
		ob.Print(10);
	}
    void Print(int i)
     {
	      if(i>=1)
	  {   
		  c=a+b;
		  System.out.print(" "+c);
		  a=b;
		  b=c;
		  Print(i-1);
	  }
  }
}
