class PrimeNum {
    public static void main(String ae[]) {
        int n = 9;
        boolean isTrue = true;

        if (n < 2) {
            isTrue = false; // Set isTrue to false if n is less than 2
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {  // If a number has any divisors between 2 and its square root, it is not prime.
                if (n % i == 0) {
                    isTrue = false;
                    break;
                }
            }
        }

        System.out.println(isTrue ? "prime" : "not a prime");
    }
}

// Here's how it works:
// Divisibility Check: You are checking the numbers from 2 to 6 (i.e., 2, 3, 4, 5, 6) to see if any of them divide 36.

// If any of these numbers divide 36 evenly, 36 is not prime:

// 36 ÷ 2 = 18 (divides evenly, so 36 is not prime)
// 36 ÷ 3 = 12 (divides evenly, so 36 is not prime)
// 36 ÷ 4 = 9 (divides evenly, so 36 is not prime)
// 36 ÷ 6 = 6 (divides evenly, so 36 is not prime)
// Since 36 is divisible by several numbers between 2 and 6, it is not prime.

// Why is this important?
// If a number has any divisors between 2 and its square root, it is not prime.
// If no divisors are found in this range (i.e., the number is not divisible by any numbers between 2 and sqrt(n)), then the number is prime.
// Example of a Prime Number:
// Now, let's look at a prime number like 7:

// sqrt(7) ≈ 2.65, so we only need to check divisibility by numbers 2 (since the next integer is greater than the square root).
// 7 ÷ 2 does not divide evenly, so 7 is prime.