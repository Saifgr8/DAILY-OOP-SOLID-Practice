package saif.example.OOPSOLID1;

import org.springframework.stereotype.Service;
//OOPS ->
//SOLID -> DI ->
public class ProcessPayment {
    private PaymentMethod paymentMethod;

    public ProcessPayment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void doPayment(double amount) {
        paymentMethod.pay(amount);
    }
}
