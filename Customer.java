public class Customer extends User implements Authentication {
    private static int idCounter = 1000;

    private String userId;
    private String membershipLevel;
    private double walletBalance;
    private boolean isLoggedIn = false;

    // Register
    public Customer(String name, String email, String password, String phoneNumber, String membershipLevel, double walletBalance) {
        super(name, email, password, phoneNumber);
        this.userId = "USR" + (++idCounter);
        this.membershipLevel = membershipLevel;
        this.walletBalance = walletBalance;
    }

    // Login
    public Customer(String email, String password) {
        super(null, email, password, null);
    }

    @Override
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful. Welcome, " + name + "!");
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    @Override
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println("User " + name + " has logged out.");
        } else {
            System.out.println("No user is logged in.");
        }
    }

    // Getters and Setters for the additional fields
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}
