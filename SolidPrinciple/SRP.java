package SolidPrinciple;

class OrderService {

    public void placeOrder() {
        System.out.println("Order Placed Successfully");
    }
}

class DatabaseService {

    public void saveOrderToDatabase() {
        System.out.println("Order Saved To Database");
    }
}

class PaymentService {

    public void processPayment() {
        System.out.println("Payment Processed Successfully");
    }
}

class InvoiceService {

    public void generateInvoice() {
        System.out.println("Invoice Generated Successfully");
    }
}

class EmailService {

    public void sendConfirmationEmail() {
        System.out.println("Confirmation Email Sent Successfully");
    }
}

public class SRP {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        DatabaseService databaseService = new DatabaseService();

        PaymentService paymentService = new PaymentService();

        InvoiceService invoiceService = new InvoiceService();

        EmailService emailService = new EmailService();

        orderService.placeOrder();

        databaseService.saveOrderToDatabase();

        paymentService.processPayment();

        invoiceService.generateInvoice();

        emailService.sendConfirmationEmail();
    }
}