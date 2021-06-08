import java.util.Scanner;

public class assignm4b {
    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Input Data: ");
        a = scanner.nextInt();

        if (a > 0) {
            b = a % 10; // n%10 means modulus of 10. This is used to get last digit.

           // Let's say your number is 12345

           //12345 % 10 means remainder when 12345 is divided by 10, which gives you 5.

            //Thereafter when you perform (n/10) you get 1234 (all the numbers except the least significant digit that you got in previous step).
            a = b / 10;
            sum = a + b;

            System.out.println("The sum of the digits is: "+sum);


        }

    }
}