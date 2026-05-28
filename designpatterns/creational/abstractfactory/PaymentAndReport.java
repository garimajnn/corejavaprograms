package designpatterns.creational.abstractfactory;

public class PaymentAndReport {

    public static void  main(String args[]){
            PaymentReportFactory factory = new CreditCardFactory();
            factory.processPaymentAndGenerateReport();
        }
    }


    interface PaymentService{
        void doPayment();
    }
    interface ReportService{
        void dogenerateReport();
    }
    class CreditCardPayment implements PaymentService{
        public void doPayment(){
            System.out.println("credit card payment");
        }
    }
    class CreditCardReport implements ReportService{
        public void dogenerateReport(){
            System.out.println("report generate  via card payment");
        }
    }
// class DebitCard implements PaymentService{
//     public void doPayment(){
//         System.out.println("debit card payment");
//     }
// }

// class PayPal implements PaymentService{
//     public void doPayment(){
//         System.out.println("paypal payment");
//     }
// }

    interface PaymentReportFactory{
        PaymentService createPaymentMode();
        ReportService createReport();

        default void processPaymentAndGenerateReport(){
            PaymentService ps=createPaymentMode();
            ReportService rs=createReport();
            ps.doPayment();
            rs.dogenerateReport();
        }


    }

    class CreditCardFactory implements PaymentReportFactory{

        public PaymentService createPaymentMode(){
            return new CreditCardPayment();
        }
        public ReportService createReport(){
            return new CreditCardReport();
        }
    }
// class PayPalFactory implements PaymentFactory{

//     public PaymentService createPaymentMode(){
//         return new PayPal();
//     }
// }
