package model4.task4;

public class UserMessage {
    private String TYPE;
    private User user;

    public UserMessage() {
    }

    public UserMessage(String TYPE, User user) {
        this.TYPE = TYPE;
        this.user = user;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserMessage that = (UserMessage) o;

        if (TYPE != null ? !TYPE.equals(that.TYPE) : that.TYPE != null) return false;
        return user != null ? user.equals(that.user) : that.user == null;
    }

    @Override
    public int hashCode() {
        int result = TYPE != null ? TYPE.hashCode() : 0;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "TYPE='" + TYPE + '\'' +
                ", user=" + user +
                '}';
    }
}

