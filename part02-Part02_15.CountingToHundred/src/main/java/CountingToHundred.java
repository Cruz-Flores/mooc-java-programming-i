
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToPrint = Integer.valueOf(scanner.nextLine());
        for (int i = numberToPrint; i <= 100; i++) {
            System.out.println(i);
        }

    }
}

// import java.util.Scanner;

// public class CountingToHundred {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// if (scanner.hasNextInt()) {
// int number = scanner.nextInt();
// if (number < 100) {
// for (int i = number; i <= 100; i++) {
// System.out.println(i);
// }
// }
// } else {
// System.out.println("Error: Input is not an integer.");
// }

// }
// }

// while (numberToPrint <= 100) {
// System.out.println(numberToPrint);
// numberToPrint++;
// }