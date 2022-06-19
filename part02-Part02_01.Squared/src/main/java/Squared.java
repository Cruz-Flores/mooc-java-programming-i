
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toSquared = Integer.valueOf(scanner.nextLine());
        int squared = toSquared * toSquared;
        System.out.println(squared);
    }
}
