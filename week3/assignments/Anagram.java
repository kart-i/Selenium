package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String word1 = "karthi";
		String word2 = "tarkhi";
		
		if(word1.length()==word2.length()) {
				char[] arr1 = word1.toCharArray();
				char[] arr2 = word2.toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				//System.out.println(arr1);
				//System.out.println(arr2);
				
				if(Arrays.equals(arr1, arr2)) {
					
					System.out.println("The given strings are anagram");
				}
				else{
					System.out.println("The given strings are not anagram");
				}
		}
		else{
				System.out.println("Lengths Mismatch,the strings are not anagram");
		}

	}
	

}
