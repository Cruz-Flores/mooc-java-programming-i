
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maxLenghtName = "";
        int sumOfAges = 0;
        int quantityOfAges = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] personalData = input.split(",");
            String name = personalData[0];
            int age = Integer.valueOf(personalData[1]);
            sumOfAges += age;
            quantityOfAges++;

            if (name.length() > maxLenghtName.length()) {
                maxLenghtName = name;
            }

        }

        System.out.println("Longest name: " + maxLenghtName);
        if (quantityOfAges > 0) {
            System.out.println("Average of the birth years: " + ((double) sumOfAges / quantityOfAges));
        }

    }
}

// import java.util.ArrayList;
// import java.util.Scanner;

// public class PersonalDetails {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// ArrayList<String> names = new ArrayList<>();
// ArrayList<Integer> birthYears = new ArrayList<>();
// while (true) {
// String input = scanner.nextLine();
// if (input.equals("")) {
// break;
// }

// String[] parts = input.split(",");
// names.add(parts[0]);
// birthYears.add(Integer.valueOf(parts[1]));
// }

// String longest = names.get(0);
// for (String name : names) {
// if(name.length() > longest.length()) {
// longest = name;
// }
// }
// System.out.println("Longest name: " + longest);

// int sumOfBirthYears = 0;
// for (int year : birthYears) {
// sumOfBirthYears = sumOfBirthYears + year;
// }
// System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears /
// birthYears.size());

// }
// }
