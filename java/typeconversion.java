public class typeconversion {
    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        int a = 10;
        double b = a;   // int to double

        System.out.println("Implicit Type Conversion:");
        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);

        // Explicit Type Conversion (Narrowing)
        double x = 25.75;
        int y = (int) x;   // double to int

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Double value: " + x);
        System.out.println("Int value: " + y);
    }
}

