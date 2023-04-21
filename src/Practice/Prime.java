package Practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in); // for user input
		//System.out.println("Enter no: ");
		//int no=sc.nextInt();
		
		int no=13;     //....given
		int temp=0;
		
		for(int i=2; i<=no-1;i++) {	
		    if(no%i==0)
		{
			temp=temp+1;
		}
	}
		if(temp==0) {
			System.out.println("No. is Prime");
		}
		else
		{
			System.out.println("No. is Not Prime");
		}
	}

}
