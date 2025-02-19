public class Admin {

    private String email;
    private String phoneNumber;
    private String name;
    private String password;
    private int ID;
    private static int counter = 0;
    
    public Admin(String email, String phoneNumber, String name, String password) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.password = password;
        this.ID = ++counter;
        
    }
    public Admin(String email, String password){
        this.email = email;
        this.password = password;
    }

    //getter
    public String getEmail(String password){
        return email;

    }

    public String getPhoneNumber(String password){
        return phoneNumber;
    }

    public String getName(String inputPassword){
        if(inputPassword.equals(this.password)){
            return name;
        }else{
            return "Invalid Password";
        }
    }
    
    public int getId(String password){
        return ID;
    }

    public String getPassword(String password){
        return password;
    }
    //setter
    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password){
        this.password = password;
    }
}