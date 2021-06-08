import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, sum, difference, product, average, distance, max, min;

        System.out.println("Input 1st integer ");
        number1 = scanner.nextInt();
        System.out.println("Input 2nd integer ");
        number2 = scanner.nextInt();
        sum = number1 + number2;
        System.out.println("Sum of two integers: " +sum);

        difference = number1 - number2;
        System.out.println( "Difference of two integers: " +difference);

        product = number1 * number2;
        System.out.println( "Product of two integers: " +product);

        average = (number1 + number2) / 2;
        System.out.println("Average: " +average);

        distance = Math.abs(number1 - number2);
        System.out.println( "Distance: " +distance);

        max = Math.max(number1, number2);
        System.out.println("Max integer " + max);

        min = Math.min(number1, number2);
        System.out.println("Min integer " + min);


    }
}
