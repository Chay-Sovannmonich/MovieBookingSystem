public class MovieBooking extends Booking {
    private String movieName;
    private String cinemaHall;

    public MovieBooking(String user, int seatBooked, String bookingDate, double totalPrice, String paymentMethod, String paymentStatus, String movieName, String cinemaHall) {
        super(user, seatBooked, bookingDate, totalPrice, paymentMethod, paymentStatus);
        this.movieName = movieName;
        this.cinemaHall = cinemaHall;
    }

    public String getMovieName() {
        return movieName; 
    }
    
    public String getCinemaHall() { 
        return cinemaHall; 
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMovie Name: " + movieName +
               "\nCinema Hall: " + cinemaHall;
    }
}
