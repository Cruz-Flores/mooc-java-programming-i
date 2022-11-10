
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] pieces = sentence.split(" ");
        int i = 0;
        while (i < pieces.length) {
            if (pieces[i].contains("av")) {
                System.out.println(pieces[i]);
            }
            i++;
        }
    }
}
