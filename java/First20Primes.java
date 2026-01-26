public class First20Primes {
    public static void main(String[] args) {

        int count = 0;   // number of primes found
        int num = 2;     // starting number

        while (count < 20) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
