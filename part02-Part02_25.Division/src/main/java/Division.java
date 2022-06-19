import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
        Scanner scanner = new Scanner(System.in);
        int firstParam = Integer.valueOf(scanner.nextLine());
        int secondParam = Integer.valueOf(scanner.nextLine());
        division(firstParam, secondParam);

    }

    // implement the method here
    public static void division(int firstNum, int secondNum) {
        System.out.println((double) firstNum / secondNum);

    }
}
