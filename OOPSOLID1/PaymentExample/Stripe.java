package saif.example.OOPSOLID1;

//OOPS -> POLYMOPHISM -> OVERRIDING AND OVERLOADING, INHERITANCE
//SOLID -> LSP -> OCP
public class Stripe extends OnlinePayments implements PaymentMethod {
    String name;
    String location;

    public Stripe(boolean isValid, String name) {
        super(isValid);
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment with Stripe is done");
    }

    public void certification(boolean valid, String name, String  location){
        System.out.println("This is Stripe provider: " + name + "and he is: " + valid + "via location: " + location);
    }
}
