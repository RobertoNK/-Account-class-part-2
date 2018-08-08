
public class borrador2 {

	public static void main(String[] args) {
		// test for Account class
		Account acc1 = new Account(100,"Roberto","1234");
		System.out.println(acc1.getCustomerName());
		System.out.println(acc1.getAccountNumber());
		System.out.println(acc1.getBalance());
		acc1.withdraw(200);
		System.out.println(acc1.getBalance());
	}

}
