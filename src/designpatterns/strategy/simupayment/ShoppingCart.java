package designpatterns.strategy.simupayment;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    private float currentCartValue;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void addToCurrentCartValue(float amount){
        this.currentCartValue += amount;
    }

    public void checkout(){
        paymentStrategy.pay(currentCartValue);
    }

    public float getCurrentCartValue() {
        return this.currentCartValue;
    }
}
