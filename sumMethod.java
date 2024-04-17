package methodsJava;
import java.util.Scanner;
public class sumMethod {
	
	public static void sumOfNumbers(int a ,int b) {
	
		
		System.out.println("the sum of " +a+ " and " +b+ " is: " +(a+b));
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 1st number: ");
		int a = scanner.nextInt();
		System.out.println("enter second number: ");
		int b = scanner.nextInt();
		
		sumOfNumbers(a, b);
		
		scanner.close();
		}
	

}
