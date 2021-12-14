package enumeracoesEcomposicao;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;


public class AprendendoEnumeracoes {

	public static void main(String[] args) {
		
		// enum serve como constantes
		
		Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}