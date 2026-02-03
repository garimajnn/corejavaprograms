package designpatterns.behavioural.strategy.badsolution;

    class Checkout {
        private String paymentType;

        public Checkout(String paymentType) {
            this.paymentType = paymentType;
        }

        public void pay() {
            if ("gpay".equalsIgnoreCase(paymentType)) {
                System.out.println("Paying with GPay");
                // GPay payment logic here
            } else if ("paypal".equalsIgnoreCase(paymentType)) {
                System.out.println("Paying with PayPal");
                // PayPal payment logic here
            } else if ("creditcard".equalsIgnoreCase(paymentType)) {
                System.out.println("Paying with Credit Card");
                // Credit Card payment logic here
            } else {
                System.out.println("Invalid payment type");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Checkout checkout = new Checkout("gpay");
            checkout.pay();
        }
    }

