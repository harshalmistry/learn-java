package designpatterns.strategy.simupayment;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String name;

    private float limit;

    public CreditCardPayment(String cardNumber, String name, float limit){
        this.cardNumber = cardNumber;
        this.name = name;
        this.limit = limit;
    }

    @Override
    public void pay(float amount) {
        if (amount > limit){
            System.out.println("Payment € "+ amount +" failed using credit card : " + this.cardNumber +
            "\nMaximum limit "+ limit +" reached.");
        }
        else{
            System.out.println("Paid €" + amount + " using credit card : " + this.cardNumber);
        }
    }
}
