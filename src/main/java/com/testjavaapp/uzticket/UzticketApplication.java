package com.testjavaapp.uzticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UzticketApplication {

	public static void main(String[] args) {
		// SpringApplication.run(UzticketApplication.class, args);

		var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();
	}
}
