
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int valueOfTheGift = Integer.valueOf(scan.nextLine());
        if (valueOfTheGift < 3500) {
            System.out.println("No tax!");
        } else if (valueOfTheGift > 5000 && valueOfTheGift <= 25000) {
            double tax = (100 + (valueOfTheGift - 5000) * .08);
            System.out.println("Tax: " + tax);
        } else if (valueOfTheGift > 25000 && valueOfTheGift <= 55000) {
            double tax = (1700 + (valueOfTheGift - 25000) * .10);
            System.out.println("Tax: " + tax);
        } else if (valueOfTheGift > 55000 && valueOfTheGift <= 200000) {
            double tax = (4700 + (valueOfTheGift - 55000) * .12);
            System.out.println("Tax: " + tax);
        } else if (valueOfTheGift > 200000 && valueOfTheGift <= 1000000) {
            double tax = (22100 + (valueOfTheGift - 200000) * .15);
            System.out.println("Tax: " + tax);
        } else if (valueOfTheGift > 1000000) {
            double tax = (142100 + (valueOfTheGift - 1000000) * .17);
            System.out.println("Tax: " + tax);
        }

    }
}
