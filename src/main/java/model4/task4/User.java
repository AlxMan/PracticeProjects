package model4.task4;

import java.io.Serializable;

public class User{
    private String username;
    private String pasword;

    public User() {
    }

    public User(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        return pasword != null ? pasword.equals(user.pasword) : user.pasword == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (pasword != null ? pasword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}
