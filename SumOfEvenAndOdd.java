package loopsPractice;

import java.util.Scanner;

public class SumOfEvenAndOdd {
public static void main(String[] args) {
	System.out.println("enter the number of integers");
	Scanner scanner = new Scanner(System.in);
	//read the number of integers from user
	int count = scanner.nextInt();
	int evenSum=0;
	int oddSum=0;
	 
	System.out.println("enter "+count+" integers");
	
	for(int i =0;i<count;i++) {
		
		int num = scanner.nextInt();
		
		if(num%2==0) {
			evenSum=evenSum+num;
		}else {
			oddSum = oddSum+num;
		}
	}
	System.out.println("sum of even integers is "+evenSum);
	System.out.println("sum of odd integers is "+oddSum);
	
}
}
