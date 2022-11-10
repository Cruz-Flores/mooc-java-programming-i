
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int i = 0;
        String numbers = "";

        while (i < array.length) {
            numbers = numbers + array[i];
            if (i != array.length - 1) {
                numbers = numbers + ", ";

            }
            i++;
        }

        System.out.println(numbers);
    }
}
