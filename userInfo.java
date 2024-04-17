package methodsJava;
import java.util.Scanner;

public class userInfo {
	public static void userInformation(String name, int age, String fullName) {
		System.out.println("your name is : "+name);
		System.out.println("your age is : "+age);
		System.out.println("your full name is :"+fullName);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name:");
		String name = sc.next();
		System.out.println("enter your age:");
		int age = sc.nextInt();
		//to consume the newline
		sc.nextLine();
		System.out.println("enter your full name");
		String fullName =sc.nextLine();
		
		userInformation(name, age, fullName);
		
		
//When you use sc.nextLine() after sc.nextInt(), sc.nextLine() consumes the newline character left after the call
//to nextInt(), but it doesn't wait for further input from the user. As a result,
//it reads the newline character immediately and moves to the next line.
		
	}

}
