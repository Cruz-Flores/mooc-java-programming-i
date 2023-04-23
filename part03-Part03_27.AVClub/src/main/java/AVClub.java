
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            if (sentence.equals("")) {
                break;
            }

            String[] pieces = sentence.split(" ");
            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }

            }
        }
    }
}
