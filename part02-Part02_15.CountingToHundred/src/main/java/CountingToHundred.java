
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.next());

        int count = number;
        boolean isShowedTheMessage = false;
        while (count <= 100) {

            if (count < -1 || count >= 98) {
                System.out.println(count);
            }

            if (count >= -1 && count < 98) {
                if (!isShowedTheMessage) {
                    System.out.println("...many numbers...");
                    isShowedTheMessage = true;
                }
            }

            count = count + 1;

        }
    }
}
