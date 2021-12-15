package application;

import entities.BusinessAccount;
import entities.SavingsAccount;
import entities.conta;

public class OverrideEsuper {
public static void main(String[] args) {
	

	conta acc1 = new conta (1001, "Alex", 1000.0);
	acc1.withdraw(200.0);
	System.out.println(acc1.getBalance());
	
	conta acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
	acc2.withdraw(200.0);
	System.out.println(acc2.getBalance());
	
	conta acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
	acc3.withdraw(200.0);
	System.out.println(acc3.getBalance());
}
}