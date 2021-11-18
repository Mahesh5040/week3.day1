package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The deposit value is 15%");
	}
	public static void main(String[] args) {
	  AxisBank info = new AxisBank();
	  info.deposit();
	}

}
