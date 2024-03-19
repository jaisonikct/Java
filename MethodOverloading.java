public class MethodOverloading {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Testing the overloaded methods
        int result1 = add(5, 10);
        int result2 = add(5, 10, 15);
        double result3 = add(2.5, 3.5);

        System.out.println("Result of adding two integers: " + result1);
        System.out.println("Result of adding three integers: " + result2);
        System.out.println("Result of adding two doubles: " + result3);
    }
}
