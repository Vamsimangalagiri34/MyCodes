class PrimeNum {
    public static void main(String args[]) {
        int num = 29; // Example number to check
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // exit the loop if a factor is found
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}

// Example: Checking if 29 is a Prime Number
// Using num / 2
// If we check up to num / 2, we would iterate through the following steps:

// num
// =
// 29
// num=29
// Check divisors from 2 to 14 (num / 2):
// 29 % 2 ≠ 0
// 29 % 3 ≠ 0
// 29 % 4 ≠ 0
// 29 % 5 ≠ 0
// 29 % 6 ≠ 0
// 29 % 7 ≠ 0
// 29 % 8 ≠ 0
// 29 % 9 ≠ 0
// 29 % 10 ≠ 0
// 29 % 11 ≠ 0
// 29 % 12 ≠ 0
// 29 % 13 ≠ 0
// 29 % 14 ≠ 0
// Since none of these numbers divide 29 without a remainder, 29 is confirmed as a prime number. However, we performed 13 checks.

// Using Math.sqrt(num)
// If we check up to the square root of the number, we would iterate through fewer steps:

// num
// =
// 29
// num=29
// sqrt(num)
// ≈
// 5.39
// sqrt(num)≈5.39
// Check divisors from 2 to 5:
// 29 % 2 ≠ 0
// 29 % 3 ≠ 0
// 29 % 4 ≠ 0
// 29 % 5 ≠ 0
// Since none of these numbers divide 29 without a remainder, 29 is confirmed as a prime number. We only performed 4 checks, which is much more efficient.