package methodsJava;
import java.security.PublicKey;
import java.util.Scanner;
public class average {
	
	public static int sumNumbers(int a, int b, int c) {
		
		return(a+b+c);
	
		
	}
	public static void averageNumber(int a , int b , int c) {
		
		System.out.println("the average is: "+sumNumbers(a, b, c)/3);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number: ");
		int a =sc.nextInt();
		System.out.println("enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("enter the 3rd number: ");
		int c= sc.nextInt();
		  
		averageNumber(a, b, c);
	}
	

}
