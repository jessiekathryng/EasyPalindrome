package com.leetcode.java.palindrome;


public class ValidPalindrome {

	public static void main(String[] args) {
		
//		First we need to convert the string to all lowercase in order to avoid casing issues
		String str = "A man, a plan, a canal: Panama";
		str = str.toLowerCase();
		
//		We are using the ^ notation to say everything except a-z, A-Z, and 0-9 should be replaced with nothing
		String NewString = str.replaceAll("[^a-zA-Z0-9]", "");
		
		String ReverseString = "";
//		Using a for loop to go through each character index starting from the end of the string
		for(int i = NewString.length()-1; i >= 0; i--)
			ReverseString+=NewString.charAt(i);
		
		
		if(NewString.equals(ReverseString)) {
			System.out.println("This string is a Palindrome");
		}else {
			System.out.println("This string is not a plaindrome");
		}

	}

}


