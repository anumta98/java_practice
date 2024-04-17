package methodsJava;
import java.lang.*;
import java.util.Scanner;
public class middleOfString {
	
	public static void middle(String str ) {
		if (str.length()%2==0) {
			System.out.println("string is even");
			System.out.println(str.charAt(str.length()/2-1));
			
		}else {
			System.out.println("string is odd");
			System.out.println(str.charAt(str.length()/2));
			
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string: ");
		String str =scanner.next();
		middle(str);
	}

}
