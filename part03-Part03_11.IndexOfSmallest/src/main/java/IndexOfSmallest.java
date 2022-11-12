
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int smallest = 1000000000;
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        // int smallest = list.get(0);
        // int index = 0;
        // while (index < list.size()) {
        // if (list.get(index) < smallest) {
        // smallest = list.get(index);
        // }

        // index++;
        // }

        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                indexList.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < indexList.size(); i++) {
            System.out.println("Found at index: " + indexList.get(i));
        }

    }
}
