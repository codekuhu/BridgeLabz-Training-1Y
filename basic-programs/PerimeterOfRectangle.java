import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        double l = sc.nextDouble();

        System.out.println("Enter breadth:");
        double b = sc.nextDouble();

        double p = 2 * (l + b);
        System.out.println(p);
    }
}
