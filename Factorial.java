package methodsJava;

import java.util.*;
public class Factorial {
	public static void printFactorial(int n) {
		
		if(n<0) {
			System.out.println("invalid input");
			return;
		}
		int factorial = 1;
		//loop for printing factorial
		for(int i =1;i>=1;i--) {
			
			factorial= factorial*1;
		}
		System.out.println(factorial);
		return;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printFactorial(n);
		sc.close();
	}





	

}
