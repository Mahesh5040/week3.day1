package week3.day1;

public class ComparingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I am Learning Java";
		String str2 = "I am Learning Java?";
		
		boolean b1 = str2.equalsIgnoreCase(str1);
		System.out.println("str2 is equal to str1 =" + b1);

	}

}
