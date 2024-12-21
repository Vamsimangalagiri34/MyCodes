import java.util.*;

class PerfectNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = 28, sum = 0; // Example number 28
        // n = scan.nextInt();

        for (int i = 1; i < n; i++) { // Use < instead of <= to exclude the number itself
            if (n % i == 0) {//<= it mean it includs the number also
                sum += i;
            }
        }

        if (sum == n) {
            System.out.printf("%d is a perfect number. Sum of its divisors is %d.%n", n, sum);
        } else {
            System.out.printf("%d is not a perfect number. Sum of its divisors is %d.%n", n, sum);
        }
    }
}
