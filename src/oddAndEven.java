import java.util.Scanner;

public class oddAndEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
        // or “Even Number” otherwise. The program shall always print “bye!” before exiting.
        //Hints
        //n is an even number if (n % 2) is 0; otherwise, it is an odd number. Use == for comparison, e.g., (n % 2) == 0.
        System.out.println("Please enter your number: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");

        }
        System.out.println("bye!");
    }
}
