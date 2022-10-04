package methodOverriding;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposited amount");
		
	}

	public static void main(String[] args) {
		AxisBank AB = new AxisBank();
		AB.deposit();
		AB.saving();
		AB.fixed();
		
		

	}

}
