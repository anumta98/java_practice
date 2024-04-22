package loopsPractice;
import java.util.*;
public class table {
public static void main(String[] args) {
	System.out.println("enter the number of which you want the table");

	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	
	
	for (int i=1;i<=10;i++) {
		System.out.println(n+"*"+i+"=" +n*i);
		
	}
	
}
}
