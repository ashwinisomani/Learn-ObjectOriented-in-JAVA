package Operators;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Arithmetic Operators
        System.out.println("a + b : " + (a+b));
        System.out.println("a - b : " + (a-b));
        System.out.println("a * b : " + (a*b));
        System.out.println("a / b : " + (a/b));
        System.out.println("a % b : " + (a % b));

        //Relational Operation - boolean response
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        //Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3 : " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 : " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4 : " + c);

        // Unary Operators
        int d = 7;
        System.out.println("d : " + d);
        System.out.println("++d : " + (++d)); // pre-increment
        System.out.println("d++ : " + (d++)); // post-increment
        System.out.println("--d : " + (--d)); // pre-decrement
        System.out.println("d-- : " + (d--)); // post-decrement
        System.out.println("Final d : " + d);

        // Ternary Operator
        int largest = (a > b) ? a : b;
        System.out.println("Largest of a and b: " + largest);

        // Shift Operators
        int p = 8; // 8 in binary: 1000\
        System.out.println("p << 1: " + (p << 1)); // Left shift
        System.out.println("p >> 1: " + (p >> 1)); // Right shift
        System.out.println("p >>> 1: " + (p >>> 1)); // Zero-fill right shift
    }

}
