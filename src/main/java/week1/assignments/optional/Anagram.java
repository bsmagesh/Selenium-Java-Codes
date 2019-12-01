package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stops";
				//Declare another String
				String text2 = "spots";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
if (text1.length()==text2.length()) {
	char[] charArray1 = text1.toCharArray();
	char[] charArray2 = text2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	if(Arrays.equals(charArray1,charArray2)) {
		System.out.println("It is an anagram");
	}
	}
	else {
		System.out.println("Not an anagram");
	}
	}

	}


