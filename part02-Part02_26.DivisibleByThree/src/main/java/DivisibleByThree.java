
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstParam = Integer.valueOf(scanner.nextLine());
        int secondParam = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(firstParam, secondParam);

    }

    public static void divisibleByThreeInRange(int firstNum, int secondNum) {
        while (firstNum <= secondNum) {
            if (firstNum % 3 == 0) {
                System.out.println(firstNum);
            }
            firstNum++;
        }
    }

}
