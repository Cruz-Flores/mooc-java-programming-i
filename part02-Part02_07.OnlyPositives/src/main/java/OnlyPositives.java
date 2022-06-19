
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // while (true) {
        // System.out.println("Input a number");
        // int number = Integer.valueOf(scanner.nextLine());

        // if (number == 0) {
        // break;
        // }

        // if (number < 0) {
        // System.out.println("Unfit number");
        // continue;
        // }

        // System.out.println(number * number);
        // }

        // while (true) {
        // System.out.println("Input a number");
        // int number = Integer.valueOf(scanner.nextLine());

        // if (number == 0) {
        // break;
        // } else if (number < 0) {
        // System.out.println("Unfit number");
        // continue;
        // }

        // System.out.println(number * number);
        // }

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number > 0) {
                System.out.println(number * number);
            } else {
                break;
            }
        }
    }
}
