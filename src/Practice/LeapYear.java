package Practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2016;
		if(year%400==0 || year%4==0 && year%100!=0) {
			System.out.println("Leap year");
			
		}else {
			System.out.println("Not Leap year");
		}

	}

}
