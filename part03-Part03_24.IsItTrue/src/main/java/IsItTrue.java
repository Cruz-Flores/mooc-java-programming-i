
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        boolean isTrue = Boolean.valueOf(scanner.nextLine());
        if (isTrue) {
            System.out.println("You got it right!");
        }
        if (!isTrue) {
            System.out.println("Try again");
        }

    }
}
