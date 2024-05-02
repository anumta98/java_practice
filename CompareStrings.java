package stringPractice;

public class CompareStrings {
	public static void main(String[] args) {
		String s1 = "anumta";
		String s2 = "anumta";
		String s3 = new String("ussama");
		String s4 = new String("USSAMA");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s3.equals(s4));//false
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
	}

}
