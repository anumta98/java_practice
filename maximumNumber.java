package methodsJava;
import java.lang.*;
import java.util.*;
public class maximumNumber {
	
	public static int findMaxNumber(int a, int b, int c) {
		
		return (Math.max (Math.max(a, b), c));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("enter 1St number: ");
		int a = scanner.nextInt();
		System.out.println("enter 2nd number: ");
		int b = scanner.nextInt();
		System.out.println("enter 3rd number: ");
		int c = scanner.nextInt();
		
		System.out.println("the maximum number is "+findMaxNumber(a, b, c));
		
		
		
		
	}
	

}
