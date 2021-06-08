import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        int number, number2, greatest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the 1st number: ");
        number = scanner.nextInt();
        System.out.println("Input the 2nd number: ");
        number2 = scanner.nextInt();
        greatest = Math.max(number, number2);
        System.out.println("The greatest: " + greatest);

    }
}
