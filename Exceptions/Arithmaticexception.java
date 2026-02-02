class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 10;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
public class Arithmaticexception {
    public static void main(String[] args) {
        ArithmeticExample.main(args);
    }
}