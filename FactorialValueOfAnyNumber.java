package loopsPractice;
import java.util.Scanner;
public class FactorialValueOfAnyNumber {
public static void main(String[] args) {
	int fact=1;
	int n;
	Scanner scn = new Scanner(System.in);
	 n = scn.nextInt();

	 for(int i =1; i<=n; i++) {
		 fact*=i;
	 }
	 System.out.println(fact);
	
	
}
}
/*while (i<=n){
  fact*=i;
  i++
  }
 */