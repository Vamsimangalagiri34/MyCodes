class PrimeNum {
    public static void main(String args[]) {
        int num = 179;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                System.out.println(i);
                // break;  // exit the loop if a factor is found
            }
        }
        // if (isPrime) {
        //     System.out.println("\nprime number");
        // } else {
        //     System.out.println("\nnot prime");
        // }
    }
}
