
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerlimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerlimit + ", " + upperLimit + "]");
        for (Integer number : numbers) {
            if (number >= lowerlimit && number <= upperLimit)
                System.out.println(number);
        }
    }

    // public static void printNumbersInRange(ArrayList<Integer> numbers, int
    // lowerLimit, int upperLimit) {
    // for (Integer number : numbers) {
    // if (number < lowerLimit) {
    // continue;
    // }

    // if (number > upperLimit) {
    // continue;
    // }

    // System.out.println(number);
    // }
    // }

}
