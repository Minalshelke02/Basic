package Practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int num=n;
		int rev,sum=0;
		
		while(num>0) {
			rev=num%10;
			sum=sum+(rev*rev*rev);
			num=num/10;
			
		}
			if(sum==n)
			{
				System.out.println("Armstrong");
			}
			else {
				System.out.println("Not Armstrong");
			}

	}

}
