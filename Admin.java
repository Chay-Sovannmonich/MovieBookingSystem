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
    public String getEmail(String inputPassword){
        if(inputPassword.equals(this.password)){
            return email;
        }else{
            return "Invalid Password";
        }
    }

    public String getPhoneNumber(String inputPassword){
        if(inputPassword.equals(this.password)){
            return phoneNumber;
        }else{
            return "Invalid Password";
        }
    }

    public String getName(String inputPassword){
        if(inputPassword.equals(this.password)){
            return name;
        }else{
            return "Invalid Password";
        }
    }
    
    public int getId(String inputPassword){
        if(inputPassword.equals(this.password)){
            return ID;
        }else{
            return -1;
        }
    }

    public String getPassword(String inputPassword){
        return " ";
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