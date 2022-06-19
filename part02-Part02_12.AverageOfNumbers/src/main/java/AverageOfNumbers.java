
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number != 0) {
                sum = sum + number;
                numbersCount = numbersCount + 1;
            }

        }
        double average = (double) sum / numbersCount;
        System.out.println("Average of the numbers: " + average);

    }
}
