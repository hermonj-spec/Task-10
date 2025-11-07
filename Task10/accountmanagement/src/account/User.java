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

    public String getUserName() {
        return UserName;
    }

    public String getEmail() {
        return Email;
    }

    public String getAccessLevel() {
        return AccessLevel;
    }

    public void displayUserDetails() {
        System.out.println("--- User Information ---");
        System.out.println("Username: " + UserName);
        System.out.println("Email: " + Email);
        System.out.println("Access Level: " + AccessLevel);
        System.out.println();
    }
}
