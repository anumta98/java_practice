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
		
		String str1 = "aqsa";
		String str2 = "aqsa";
		String str3 = new String ("aqsa");
		
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false(because s3 refers to instance created in nonpool)  
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(str1.compareTo(s1));
	
		System.out.println(s1.compareTo(str1));
	}
	
	/*s1.compareTo(s2): Both strings are equal, so the result is 0.
	s1.compareTo(s3):
	 The strings are different, 
	 but compareTo compares lexicographically. 
	 The first differing character's Unicode value in s1 is 97 
	 ('a') and in s3 is 117 ('u'). So, the result is 97 - 117 = -20.
	  (Note: 'u' - 'a' = -20)*/
	
	//The first differing character is 'n' and 'q'. 'q' comes after 'n' in lexicographical order.
	//So, the result is the Unicode value of 'q' (113) minus the Unicode value of 'n' (110), which equals 3.
}
