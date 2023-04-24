
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = 0;
        while (true) {
            String personalData = scanner.nextLine();
            if (personalData.equals("")) {
                break;
            }
            String[] parts = personalData.split(",");

            int currentAge = Integer.valueOf(parts[1]);

            if (currentAge > maxAge) {
                System.out.println(currentAge);
                maxAge = currentAge;
            }

        }

        System.out.println("Age of the oldest: " + maxAge);

    }
}
