package Practice;

public class reverseNo {

	public static void main(String[] args) {
		
		int rem, rev=0, no= 789;
		System.out.println("No is :" + no);
		while(no!=0) {
			
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
			
		}
System.out.println("Reverse  No is "+ rev);
	}

}
