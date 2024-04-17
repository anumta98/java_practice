package methodsJava;

import java.util.Scanner;
public class vowels {
	
	public static int numberOfVowels(String str ) {
		int count =0;
		for (int i=0;i<str.length();i++) {
			final char ch = str.charAt(i);
			if(ch=='a'|| ch =='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
				
			}
			
			}
		if (count==0) {
			System.out.println("String does not have any vowels");
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("enter your string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("the vowels in your string are: "+numberOfVowels(str));
		scanner.close();
	}

}
