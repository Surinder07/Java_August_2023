package oct21;

public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void userLogin(String uname, String pass){

        if(username.equals(uname) && password.equals(pass)){
            System.out.println("User is able to login");
        }
        else{
            System.out.println("Invalid password ");
        }


    }
}
