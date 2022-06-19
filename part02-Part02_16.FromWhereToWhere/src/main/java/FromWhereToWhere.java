
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int where = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int from = Integer.valueOf(scanner.nextLine());
        int counter = from;

        while (true) {
            if (counter > where) {
                break;
            }
            System.out.println(counter);
            counter = counter + 1;

        }

    }
}
