import java.util.HashMap;

public class PaymentManager {
        private HashMap<String, Payment> payments;

    public PaymentManager() {
        payments = new HashMap<>();
    }

    public void addPayment(Payment payment) {
        payments.put(payment.getPaymentId(), payment);
    }

    public Payment getPaymentById(String paymentId) {
        return payments.get(paymentId);
    }

    public HashMap<String, Payment> getAllPayments() {
        return payments;
    }

    public int getTotalPayments() {
        return payments.size();
    }
}
