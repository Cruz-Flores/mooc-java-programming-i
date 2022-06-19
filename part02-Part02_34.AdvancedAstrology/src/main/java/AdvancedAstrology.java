
public class AdvancedAstrology {

    public static String printSpaces(int number) {
        // part 1 of the exercise
        String space = "";

        while (number > 0) {
            space = space + " ";
            number--;
        }

        return space;
    }

    public static String printStars(int number) {
        String star = "";

        while (number > 0) {
            star = star + "*";
            number--;
        }

        return star;
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int i = 1;
        while (i <= size) {
            System.out.println(printSpaces(size - i) + printStars(i));
            i++;
        }
    }

    public static void printRectangle(int space, int width, int height) {
        // third part of the exercise

        while (height > 0) {
            System.out.println(printSpaces(space) + printStars(width));
            height--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int spaceForRectangle = height - 2;
        int star = 1;
        while (height > 0) {
            height--;
            System.out.println(printSpaces(height) + printStars(star));
            star = star + 2;
        }

        printRectangle(spaceForRectangle, 3, 2);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);

    }
}
