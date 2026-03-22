public class PropagationExample {

    static void method1() {
        // will cause ArithmeticException
        int x = 10 / 0;
    }

    static void method2() {
        // calling method1
        method1();
    }

    public static void main(String[] args) {

        try {
            method2(); // exception propagates here

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}