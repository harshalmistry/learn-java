package designpatterns.strategy.simupayment;

public class SimUPaymentMain {

    public static void main(String[] args) {
        System.out.println("***** Welcome to ShopMart *****");

        // initializing shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        // adding some products into cart and updating cart value.
        System.out.println("Adding Product 1 of value €10");
        shoppingCart.addToCurrentCartValue(10f);
        System.out.println("Adding Product 2 of value €5.2");
        shoppingCart.addToCurrentCartValue(5.2f);
        System.out.println("Adding Product 2 of value €0.99");
        shoppingCart.addToCurrentCartValue(0.99f);
        System.out.println("Current cart value - €" + shoppingCart.getCurrentCartValue());

        System.out.println("Customer: I would like to pay by card");
        // initializing credit card payment with maximum limit as €10
        CreditCardPayment creditCardPayment = new CreditCardPayment("1000 1001 1002 1003",
                "Harshal Mistry", 10f);

        // suppose customer wants to pay with credit card
        // setting payment method as credit card and doing checkout
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkout();

        System.out.println("Cashier: Your transaction was declined");
        System.out.println("Customer: No Problem, I would like to pay by Paypal");
        // it was expected to fail the checkout as limit is less than current cart value
        // customer now wants to pay with paypal
        // initializing paypal
        PaypalPayment paypalPayment = new PaypalPayment("my-paypal-email@xyz.com");
        shoppingCart.setPaymentStrategy(paypalPayment);
        shoppingCart.checkout();

        System.out.println("Cashier: Thank you for Payment, here is the receipt");
    }
}
