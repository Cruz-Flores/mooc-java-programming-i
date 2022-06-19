
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                numbersCount = numbersCount + 1;
            }

        }

        System.out.println("Number of numbers: " + numbersCount);

    }
}
