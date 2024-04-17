package methodsJava;

import java.util.Scanner;

public class wordsOfString {
	public static void wordsCount(String str) {
		String[] words = str.split("\\s+");
		int wordCount = words.length;
		
//	str.split("\\s+") splits the string str 
//into an array of substrings based on
//one or more whitespace characters.
//words.length retrieves the length of the array,
//which corresponds to the number of words in the original string.				
		
		System.out.println("the number of words are : "+wordCount);
	}
	public static void main(String[] args) {
		System.out.println("enter your sentence: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		wordsCount(str);
		
	}

}
