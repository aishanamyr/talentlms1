import java.util.Scanner;

public class nameOfTheWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        //String Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        System.out.println("Input number: ");
        number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        } else if (number ==2) {
            System.out.println("Tuesday");
        } else if ( number ==3) {
            System.out.println("Wednesday");
        } else if (number ==4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else  {
            System.err.println("Please enter valid days of a week ");
        }




    }


}

