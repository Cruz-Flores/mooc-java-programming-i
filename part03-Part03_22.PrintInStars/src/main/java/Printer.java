
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int i = 0;
        while (i < array.length) {
            System.out.println(printStars(array[i]));
            i++;
        }
    }

    public static String printStars(int quantity) {
        String stars = "";
        int i = 0;
        while (i < quantity) {
            stars = stars + "*";
            i++;
        }
        return stars;
    }

    // public static void printArrayInStars(int[] array) {
    // // Write some code in here
    // for (int stars : array) {
    // printStars(stars);
    // System.out.println();
    // }
    // }

    // public static void printStars(int howMany) {
    // while (howMany > 0) {
    // System.out.print("*");
    // howMany = howMany - 1;
    // }
    // }

}
