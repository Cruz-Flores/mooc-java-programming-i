
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        boolean isTrue = Boolean.valueOf(scanner.nextLine());
        if (isTrue) {
            System.out.println("You got it right!");
        }
        if (!isTrue) {
            System.out.println("Try again");
        }

        // en mi metodo se parsea directamente el vlaoe a un booleano, lo cual
        // es incorrecto ya que la idea es usar el metodo .equals
        // System.out.print("Give a string: ");
        // String string = scanner.nextLine();

        // if (string.equals("true")) {
        // System.out.println("You got it right!");
        // } else {
        // System.out.println("Try again!");
        // }

    }
}
