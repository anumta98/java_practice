package methodsJava;


//BASIC METHODS
public class MethodsJava {

	public static void main(String[] args) {
		Multiply(2, 5);
		Multiply(34, 15);
		division(20, 5);
		Multiply(0, 0);
		Reminder(20,3);
	}
	public static void Multiply(int a, int b) {
		System.out.println(a*b);
		
	}
	public static void division(int a, int b) {
		System.out.println(a/b);
	}
	public static void Reminder(int a, int b) {
		System.out.println(a%b);
		
	}
	
}
