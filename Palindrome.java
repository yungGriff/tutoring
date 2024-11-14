package Palindrome;

import java.util.Scanner;

public class Palindrome {

public static boolean checkPalindrome(String str){
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			String rev=sb.toString();
			if(rev.equals(str)) 
			{
				return true;
			}
			
			return false;
			
}

public static boolean palindrome(String s) {
	int strLength = s.length();
	if(strLength <= 1) {
		return true;
	}
	if(s.charAt(0) == s.charAt(strLength - 1)) {
			return palindrome(s.substring(1, strLength - 1));
	}
	
	return false;
}


public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter in the word you would like to see if it is a palindrome.");
		String str=scan.next().toLowerCase();
		boolean a=checkPalindrome(str);
		boolean b = palindrome(str);
		System.out.println(a);
		System.out.println(b);
		
		// this is how you comment code in Java
		
		System.out.println("Here I am posting a new line that says  what I just wrote " + str);
		
	}

}

