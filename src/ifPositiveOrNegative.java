import java.util.Scanner;

public class ifPositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  number;

        System.out.println("Input number: ");
        number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Number is positive");
        } else if (number <= 0) {
            System.out.println("Number is negative");

        }
    }
}
