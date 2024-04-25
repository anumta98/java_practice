package classObjectPractice;

public class classPractice {
	int id;
	String name;

}
class info{
	
	public static void main(String[] args) {
		
		classPractice info1 = new classPractice();
		classPractice info2 = new classPractice();
		classPractice info3 = new classPractice();
		
		info1.name = "anumta";
		info1.id = 1;
		
		info2.name = "ussama";
		info2.id = 2;
		
		info3.name = "aqsa";
		info3.id = 3;
		
		
		
		System.out.println(info1.id+" "+info1.name);
		System.out.println(info2.id+" "+info2.name);
		System.out.println(info3.id+" "+info3.name);
		
	}
}
