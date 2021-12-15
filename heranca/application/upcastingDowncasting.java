package application;


import entities.BusinessAccount;
import entities.SavingsAccount;
import entities.conta;

public class upcastingDowncasting {

	
		public static void main(String[] args) {

			conta acc = new conta(1001, "Alex", 0.0);
			BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
			
			// UPCASTING
			
			conta acc1 = bacc;
			conta acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
			conta acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
			
			// DOWNCASTING
			
			BusinessAccount acc4 = (BusinessAccount)acc2;
			acc4.loan(100.0);
			
			// BusinessAccount acc5 = (BusinessAccount)acc3;
			if (acc3 instanceof BusinessAccount) {
				BusinessAccount acc5 = (BusinessAccount)acc3;
				acc5.loan(200.0);
				System.out.println("Loan!");
			}
			
			if (acc3 instanceof SavingsAccount) {
				SavingsAccount acc5 = (SavingsAccount)acc3;
				acc5.updateBalance();
				System.out.println("Update!");
			}
		}
	}

