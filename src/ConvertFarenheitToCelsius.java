import java.util.Scanner;

public class ConvertFarenheitToCelsius {
    public static void main(String[] args) {
      double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + "in Celsius");

        System.out.println();

        double inch, meter;
        System.out.println("Input a value in inches ");
        inch = scanner.nextDouble();
        meter = (0.0254 * inch);
        System.out.println( inch +" inch " + " is " + meter + " meters");





    }
}