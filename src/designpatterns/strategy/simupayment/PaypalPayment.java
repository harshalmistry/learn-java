package designpatterns.strategy.simupayment;

public class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment(String email){
        this.email = email;
    }
    @Override
    public void pay(float amount) {
        System.out.println("Paid €" + amount + " using Paypal : " + this.email);
    }
}
