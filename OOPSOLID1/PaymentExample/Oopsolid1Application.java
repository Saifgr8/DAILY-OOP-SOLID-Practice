package saif.example.OOPSOLID1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//OOPS -> ENCAP, INHERITANCE, POLY, ABSTRACTION
//SOLID -> SRP, OCP, LSP, ISP
@SpringBootApplication
public class Oopsolid1Application {

	public static void main(String[] args) {
		SpringApplication.run(Oopsolid1Application.class, args);
		PaymentMethod method1 = new PayPalPayment(true, "saif");
		method1.pay(2500);

		PaymentMethod method2 = new Stripe(true, "saif");
		method2.pay(4300);
	}

}
