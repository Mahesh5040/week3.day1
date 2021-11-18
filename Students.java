package week3.day1;

public class Students {
	
	public void getStudentInfo(int num) {
		System.out.println(num);
	}
	
	

	public void getStudentInfo(int num1, String name) {
		System.out.println(num1);
		System.out.println(name);
		
	}
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println(email);
		System.out.println(phonenumber);

}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(1);
		std.getStudentInfo(1, "Mahesh");
		std.getStudentInfo("mahesh@gmail.com", "7401408127");
	}
}