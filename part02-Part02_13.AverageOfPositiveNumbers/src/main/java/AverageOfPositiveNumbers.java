
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbersCount = 0;
        int sum = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number < 0) {
                continue;
            }

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum = sum + number;
                positiveNumbersCount = positiveNumbersCount + 1;
            }

        }
        if (sum > 0) {
            double average = (double) sum / positiveNumbersCount;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
