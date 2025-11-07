package systemlauncher;
import account.User;
import catalog.Software;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Wallace", "wallace@techapp.com", "Admin");
        User user2 = new User("Thomas", "thomas@techapp.com", "Standard User");

        Software app1 = new Software("CodeEditor", "v3.2.1", 18.99);
        Software app2 = new Software("AntivirusPro", "v10.5", 21.99);

        System.out.println("--- Registered Users ---");
        user1.displayUserDetails();
        user2.displayUserDetails();

        System.out.println("--- Available Software ---");
        app1.displaySoftwareDisplay();
        app2.displaySoftwareDisplay();

        System.out.println("--- Specific Data ---");
        System.out.println("First user name: " + user1.getUserName());
        System.out.println("First software name: " + app2.getSoftwareName());
    }
}
