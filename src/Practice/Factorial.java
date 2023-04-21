package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		      System.out.println("Enter no :");
              Scanner sc= new Scanner(System.in);
              int no=sc.nextInt();
              
		      int f=1;
		      for(int i=1; i<=no; i++) {
			 f=f*i;
			 
		 }
			System.out.println("factorial of "+no+ " is " + f);

	}

}
