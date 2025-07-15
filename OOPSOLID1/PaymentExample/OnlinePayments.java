package saif.example.OOPSOLID1;
//PARENT
//OOPS -> INHERITANCE... AND ENCUAPSULATION
//SOLID -> LSP...
public class OnlinePayments {
    private boolean isValid;

    public OnlinePayments(boolean isValid) {
        this.isValid = isValid;
    }
    public void certification(boolean valid){
        System.out.println("This is certified provider:  " + valid);
    }
}
