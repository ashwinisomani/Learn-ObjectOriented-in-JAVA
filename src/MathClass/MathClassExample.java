package MathClass;

public class MathClassExample {
    public static void main(String[] args) {
        // Absolute Value
        int negative = -10;
        System.out.println("Absolute value of -10: " + Math.abs(negative));

        // Maximum and Minimum
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));

        // Square Root and Power
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("2 raised to the power 3: " + Math.pow(2, 3));

        // Rounding Methods
        double num = 5.7;
        System.out.println("Round of 5.7: " + Math.round(num));
        System.out.println("Ceiling of 5.7: " + Math.ceil(num));
        System.out.println("Floor of 5.7: " + Math.floor(num));

        // Trigonometric Functions
        double angle = 45.0;
        System.out.println("Sine of 45 degrees: " + Math.sin(Math.toRadians(angle)));
        System.out.println("Cosine of 45 degrees: " + Math.cos(Math.toRadians(angle)));
        System.out.println("Tangent of 45 degrees: " + Math.tan(Math.toRadians(angle)));

        // Random Number Generation
        System.out.println("Random number: " + Math.random());

        // Constants
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of E: " + Math.E);
    }
}