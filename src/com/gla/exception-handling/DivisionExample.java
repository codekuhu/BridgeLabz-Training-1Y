 

import java.util.Scanner; // for user input
import java.util.InputMismatchException; // for invalid input

public class DivisionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Division
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Division by zero
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            // Non-numeric input
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}