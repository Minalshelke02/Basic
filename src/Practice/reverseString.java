package Practice;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String sen = sc.nextLine();
		sen = sen + " ";
		String word = "", rev = "";

		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch != ' ') {
				word = word + ch;

			} else {
				rev = word + " " + rev;
				word = "";
			}
		}
		System.out.println(rev);
	}

}
