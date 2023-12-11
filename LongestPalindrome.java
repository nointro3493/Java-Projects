import java.util.Scanner;
public class LongestPalindrome {
	public static void main(String [] args) {
		String palindrome = "";
		Scanner myscanner  = new Scanner(System.in);
		System.out.print("Enter your String: ");
		String userString = myscanner.nextLine();
		palindrome = longestPalindrome(userString);
		int cnt  = palindrome.length();
		
		if(palindrome.length() == 0) {
			System.out.println("There is no palindrome");
		}
		else if(palindrome.length() > 0) {
			System.out.println("The longest palindrome in " + userString + " is " + palindrome);
			System.out.println("The length of this palindrome is: " + cnt);
		}
		}
		


	

	public static String longestPalindrome(String userString) {

		String reversed = "";
		String palindrome = "";
		int length = userString.length();

		for(int i = userString.length()-1; i >= 0; i--) {
			reversed = reversed + userString.charAt(i);
		}
		
		int oldIndex = userString.indexOf(userString.charAt(0));
		
		int newCnt = 1;
		int oldCnt = 0;


		for(int i = 0; i <= userString.length()-1; i++) {
			if((int)userString.charAt(i) == (int)reversed.charAt(i)) {
				palindrome = palindrome + userString.charAt(i);
				newCnt++;
				oldIndex++;
			}

		}
		if (palindrome.length() == 0) {
			palindrome = "";
		}

		return palindrome;

	}

}
