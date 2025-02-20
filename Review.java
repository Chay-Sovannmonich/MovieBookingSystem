public class Review {
    private int reviewID;
    private String userID;
    private String userName;
    private String movie;
    private Double rating;
    private String reviewComment;
    private String reviewDate;
    private static int counter = 0;
    // Constructor
    public Review(String userName, String movie, Double rating, String reviewComment, String reviewDate, String userID){
        this.reviewID = ++counter;
        this.userName = userName;
        this.userID = userID;
        this.movie = movie;
        this.rating = rating;
        this.reviewComment = reviewComment;
        this.reviewDate = reviewDate;

    }
    public Review(double rating){
        this.rating = rating;
    }

    public int getReviewID() {
        return reviewID;
    }

    public String getUserName() {
        return userName;
    }

    public String getMovie() {
        return movie;
    }

    public Double getRating() {
        return rating;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public void setUser(String userName) {
        this.userName = userName;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

}

