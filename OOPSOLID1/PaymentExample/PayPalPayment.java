package saif.example.OOPSOLID1;

//OOPS -> POLYMOPHISM -> OVERRIDING AND OVERLOADING, INHERITANCE
//SOLID -> LSP -> OCP
public class PayPalPayment extends OnlinePayments implements PaymentMethod{
    String name;

    public PayPalPayment(boolean isValid, String name) {
        super(isValid);
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment with Paypal is done");
    }

    public void certification(boolean valid, String name){
        System.out.println("This is PayPal provider: " + name + "and he is: " + valid);
    }

}
