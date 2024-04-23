package loopsPractice;

public class sumOf10Numbers {
	public int sum1(int count, int add) {
		for(count=1;count<=10;count++) {
			add+= count;
			//add =add+count;
		}
		return add;
	}
	public static void main(String[] args) {
		System.out.println("the sum of first 10 natural number is: ");
		sumOf10Numbers obj = new sumOf10Numbers();
		int result = obj.sum1(1, 0);
		System.out.println(result);
	}

}
