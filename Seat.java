import java.util.List;

public class Seat {
    private String userName;
    private List<String> seatNumber;
    private boolean isBooked;
    private String seatType;
    private double price;
    private String hall;
    //constuctor
    public Seat(String userName, List<String> seatNumber, boolean isBooked, String seatType, double price, String hall) {
        this.userName = userName;
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
        this.seatType = seatType;
        this.price = price;
        this.hall = hall;
    }
    //method
    public String getUserName(){
        return userName;
    }
    public String getSeatNumber(){
        return seatNumber.toString();
    }
    public boolean getIsBooked(){
        return isBooked;
    }
    public String getSeatType(){
        return seatType;
    }
    public double getPrice(){
        return price;
    }
    public String getHall(){
        return hall;
    }

    //setter
    public void setSeatNumber(List<String> seatNumber) {
        this.seatNumber = seatNumber;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setHall(String hall) {
        this.hall = hall;
    }

}
