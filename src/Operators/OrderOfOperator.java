package Operators;

public class OrderOfOperator {
        public static void main(String[] args) {
            int a = 10, b = 20, c = 30, d = 40;

            // 1. parentheses
            // 2. * /
            // 3. + -


            int result1 = a + b * c;
            System.out.println("Result of a + b * c: " + result1);

            // Parentheses override default precedence
            int result2 = (a + b) * c;
            System.out.println("Result of (a + b) * c: " + result2); // Expected: (10 + 20) * 30 = 900

            int result3 = d / a + b;
            System.out.println("Result of d / a + b: " + result3);

            // Modulus (%) has the same precedence as division
            int result4 = d % a + b;
            System.out.println("Result of d % a + b: " + result4);

            // Relational operators (<, >) have lower precedence than arithmetic operators
            boolean result5 = a + b > c;
            System.out.println("Result of a + b > c: " + result5); // Expected: (10 + 20) > 30 = false

            // Logical AND (&&) has higher precedence than logical OR (||)
            boolean result6 = (a < b) && (c > d) || (b < d);
            System.out.println("Result of (a < b) && (c > d) || (b < d): " + result6);
            // Expected: (true && false) || true = true

            // Assignment (=) is evaluated last
            int result7 = a + b * c; // Multiplication first, then addition, then assignment
            System.out.println("Result of result7 = a + b * c: " + result7);
        }
    }


