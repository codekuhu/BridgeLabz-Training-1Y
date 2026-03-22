public class InterestCalculator {

    // method declaring exception using throws
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

        // throwing exception using throw
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        // simple interest formula
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double result = calculateInterest(1000, 5, 2);

            System.out.println("Interest: " + result);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
