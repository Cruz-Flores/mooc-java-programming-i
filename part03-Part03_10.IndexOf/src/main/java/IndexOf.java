
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int toSearch = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (toSearch == list.get(i)) {
                System.out.println(toSearch + " is at index " + i);
            }
        }

        // int searching = Integer.valueOf(scanner.nextLine());

        // int index = 0;
        // while (index < list.size()) {
        // if (list.get(index) == searching) {
        // System.out.println(searching + " is at index " + index);
        // }

        // index++;
        // }
    }
}
