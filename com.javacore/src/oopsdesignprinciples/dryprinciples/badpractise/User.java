package oopsdesignprinciples.dryprinciples.badpractise;

public class User {

    String name;
    String password;

    public User(String user, String password) {
        this.name = user;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
