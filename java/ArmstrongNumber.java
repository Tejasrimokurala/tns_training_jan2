import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int result = 0;
        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate Armstrong value
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

        sc.close();
    }
}
