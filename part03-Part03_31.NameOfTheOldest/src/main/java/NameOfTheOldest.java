
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String theOldest = "";
        int maxAge = 0;
        while (true) {
            String personalData = scanner.nextLine();
            if (personalData.equals("")) {
                break;
            }

            String[] words = personalData.split(",");
            int age = Integer.valueOf(words[1]);
            if (age > maxAge) {
                theOldest = words[0];
                maxAge = age;
            }

        }

        System.out.println("Name of the oldest: " + theOldest);

    }
}
