
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String password = scan.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
