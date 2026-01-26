import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {              // Outer if
            System.out.println("Result: Pass");

            if (marks >= 90) {          // Inner if
                System.out.println("Grade: A+");
            } else if (marks >= 75) {
                System.out.println("Grade: A");
            } else if (marks >= 60) {
                System.out.println("Grade: B");
            } else {
                System.out.println("Grade: C");
            }

        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}

