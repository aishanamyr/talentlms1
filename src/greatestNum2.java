import java.util.Scanner;

public class greatestNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, greatest;
        System.out.println("Input the 1st number ");
        num1 = scanner.nextInt();
        System.out.println("Input the 2nd number ");
        num2 = scanner.nextInt();
        System.out.println("Input the 3rd number ");
        num3 = scanner.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest " + num2);
        } else if ( num3 > num1 && num3 > num2) {
            System.out.println("The greatest " + num3);

        }


    }
}
