
import java.time.LocalDate;

public class DefaultValue {

    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].email = "Email " + (i + 1);
            accounts[i].username = "Username " + (i + 1);
            accounts[i].fullname = "Full name " + (i + 1);
            accounts[i].createdate = LocalDate.now();

        }
        for (Account account : accounts) {
            System.out.println(account.email);
            System.out.println(account.username);
            System.out.println(account.fullname);
            System.out.println(account.createdate);
            System.out.println("\n");
        }
    }
}
