package Practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeByUser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Value:");
	int number=sc.nextInt();
	
	boolean flag=false;
	for(int i=2; i<=number/2; i++) {
		if(number%i==0) {
			flag=true;
			System.out.println("Not Prime");
			break;
		}
	}
	if(!flag)
	System.out.println("Prime");


}

	
}
