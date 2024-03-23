
class User {                                            //Class definition for the User class
    private String username;
    private String password;                           //Private instance variables to store username and password

    public User(String username, String password) {    //Constructor to initialize a User with a given username and password
        this.username = username;
        this.password = password;
    }

    public String getUsername() {                      //Getter method to retrieve the username

        return this.username;
    }

    public void setUsername(String username) {         //Setter method to set or update the username

        this.username = username;
    }

    public String getPassword() {                      //Getter method to retrieve the password

        return this.password;
    }

    public void setPassword(String password) {          //Setter method to set or update the password

        this.password = password;
    }
}
