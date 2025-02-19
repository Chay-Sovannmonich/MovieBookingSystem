public interface Authenticator {
    public void login(String ID, String password);
    public void register(String email, String password);
}
