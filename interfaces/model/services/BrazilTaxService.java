package model.services;

public class BrazilTaxService implements TaxServices {
	//calculando o imposto do brasil
	
	public double tax(double amount) {
		// o imposto é 20% pra quantias até 100 reais e 15% pra valor acima disso.
		if(amount<= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount *0.15;
		}
		
	}

}