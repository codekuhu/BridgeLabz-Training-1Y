import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message); // passes message to Exception class
    }
}

public class InvalidAgeExample {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // throwing custom exception
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            validateAge(age); // calling method

        } catch (InvalidAgeException e) {
            // handling custom exception
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}