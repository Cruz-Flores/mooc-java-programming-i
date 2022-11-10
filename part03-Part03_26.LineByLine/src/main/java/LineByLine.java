
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            String[] pieces = sentence.split(" ");
            int i = 0;
            while (i < pieces.length) {
                System.out.println(pieces[i]);
                i++;
            }
            if (pieces.length <= 1) {
                break;
            }

        }

    }
}
