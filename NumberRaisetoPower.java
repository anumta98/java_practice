package loopsPractice;


import java.util.Scanner;



public class NumberRaisetoPower {
	
	private int power(int base, int pwr) {
		int result =1;
		for(int i =0 ; i<pwr;i++) {
			result = result*base;
			
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a base: ");
		int base = scanner.nextInt();
		System.out.println("enter value of power: ");
		int pwr = scanner.nextInt();
		
	NumberRaisetoPower obj = new NumberRaisetoPower();
	
	System.out.println(obj.power(base, pwr));
	
	}

}
