
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] user1 = { "alex", "sunshine" };
        String[] user2 = { "emma", "haskell" };

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (user1[0].equals(username)) {
            if (user1[1].equals(password)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }

        if (user2[0].equals(username)) {
            if (user2[1].equals(password)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }

        if (!(user1[0].equals(username)) && !(user2[0].equals(username))) {
            System.out.println("Incorrect username or password!");

        }

        // NB! This is an aweful way to get it done. If there were more users
        // the code would get really messy. We'll learn a better way soon!
        // if ((username.equals("alex") && password.equals("sunshine")) ||
        // (username.equals("emma") && password.equals("haskell"))) {
        // System.out.println("You have successfully logged in!");
        // } else {
        // System.out.println("Incorrect username or password!");
        // }
    }
}
