package methodsJava;

public class integer_sum {
	
	public static void sumOfIntegers() {
		int number = 12345;
		int sum = 0;
		while (number > 0) {
		    sum += number % 10;
		    number /= 10;   
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sumOfIntegers();
		
			}
}
