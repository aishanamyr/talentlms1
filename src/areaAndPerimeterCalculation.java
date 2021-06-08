import java.util.Scanner;

public class areaAndPerimeterCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, width;
        System.out.println("height");
        height = scanner.nextDouble();
        System.out.println("width");
        width = scanner.nextDouble();

        double area, perimeter;
        System.out.println("Area is ");
        area = height * width;
        System.out.println(area);
        System.out.print("Perimeter is ");
        perimeter = 2 * (height + width);
        System.out.print(perimeter);


    }
}
