package account;

public class User {
    protected String UserName;
    protected String Email;
    protected String AccessLevel;

    public User(String userName, String email, String accessLevel) {
        UserName = userName;
        Email = email;
        AccessLevel = accessLevel;
    }
}
