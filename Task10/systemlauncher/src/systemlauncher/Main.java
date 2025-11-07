package systemlauncher;
import account.User;
import catalog.Software;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Wallace", "wallace@techapp.com", "Admin");
        User user2 = new User("Thomas", "thomas@techapp.com", "Standard User");

        Software app1 = new Software("CodeEditor", "v3.2.1", 18.99);
        Software app2 = new Software("AntivirusPro", "v10.5", 19.99);
    }
}
