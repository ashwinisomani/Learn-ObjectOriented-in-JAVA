package Casting;

public class CastingExample {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int num = 10;
        double doubleNum = num; // int to double
        System.out.println("Implicit Casting: " + doubleNum);

        // Explicit Casting (Narrowing)
        double pi = 3.14;
        int intPi = (int) pi; // double to int
        System.out.println("Explicit Casting: " + intPi);
    }
}

