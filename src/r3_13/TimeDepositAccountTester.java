package r3_13;

public class TimeDepositAccountTester {

	public static void main(String[] args) {
		TimeDepositAccount saving = new TimeDepositAccount(2000,2);
		saving.earned_interest();		
		System.out.printf("Balance with interest: %.2f\n", saving.getBalance());
		saving.withdraw();
		System.out.printf("Balance after withdrawal: %.2f\n", saving.getBalance());
	}

}
