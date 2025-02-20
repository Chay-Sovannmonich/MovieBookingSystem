public class Booking {
    private static int idCounter = 1000;
    private static int totalBookings = 0;

    private String bookingID;
    private String user;
    private int seatBooked;
    private String showTime;
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;

    // Constructor
    public Booking(String user, int seatBooked, String showTime, double totalPrice, String paymentMethod, String paymentStatus) {
        this.bookingID = "Booking" + (++idCounter);
        this.user = user;
        this.seatBooked = seatBooked;
        this.showTime = showTime;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        totalBookings++;
    }

    // Getters
    public String getBookingID() {
        return bookingID;
    }

    public String getUser() {
        return user;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public static int getTotalBookings() {
        return totalBookings;
    }

    // Methods from Bookable interface
    public void confirmBooking() {
        System.out.println("Booking confirmed for: " + bookingID);
    }

    public void cancelBooking() {
        System.out.println("Booking canceled for: " + bookingID);
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID +
               "\nUser: " + user +
               "\nSeats Booked: " + seatBooked +
               "\nShow Time: " + showTime +
               "\nTotal Price: $" + totalPrice +
               "\nPayment Method: " + paymentMethod +
               "\nPayment Status: " + paymentStatus;
    }
}
