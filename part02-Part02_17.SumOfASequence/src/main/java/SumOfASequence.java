
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int counter = lastNumber;
        int sum = 0;

        while (counter > 0) {
            sum = sum + counter;
            counter--;
        }

        System.out.println("The sum is " + sum);

    }
}
