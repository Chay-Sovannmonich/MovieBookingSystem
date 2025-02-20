public class Payment {
    private String paymentId;
    private String booking;
    private double amountPaid;
    private String paymentDate;
    private String transactionStatus; // Transaction status (Success/Failed)

    // Static Fields
    private static int paymentCount = 0;

    // Constructor
    public Payment(String paymentId, String booking, double amountPaid, String paymentDate, String transactionStatus) {
        this.paymentId = paymentId;
        this.booking = booking;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.transactionStatus = transactionStatus;
        paymentCount++; // Increment count on new payment
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public String getBooking() {
        return booking;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    // Default implementation for getPaymentMethod
    public String getPaymentMethod() {
        return "Unknown";
    }

    // Static method to get total payments
    public static int getPaymentCount() {
        return paymentCount;
    }

    // Process payment (default implementation)
    public boolean processPayment() {
        if (transactionStatus.equalsIgnoreCase("Success")) {
            System.out.println("Payment processed successfully.");
            return true;
        } else {
            System.out.println("Payment failed.");
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Payment ID: " + paymentId +
               "\nBooking: " + booking +
               "\nAmount Paid: " + amountPaid +
               "\nPayment Method: " + getPaymentMethod() +
               "\nPayment Date: " + paymentDate +
               "\nTransaction Status: " + transactionStatus;
    }
}
