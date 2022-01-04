package model.services;

public class BrazilTaxService {
	//calculando o imposto do brasil
	
	public Double tax(double amount) {
		// o impostoé 20% pra quantias até 100 reais e 15% pra valor acima disso.
		if(amount<= 100.0) {
			return amount * 0.2;
		}
		
	}

}