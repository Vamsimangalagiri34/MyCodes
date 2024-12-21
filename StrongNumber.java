class StrongNumber {
    public static void main(String agr[]) {
        int num = 145; // 145 is a known strong number
        int originalNum = num; // Store the original number to compare later
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            int factorial = 1;

            for (int i = 1; i <= rem; i++) {
                factorial *= i;
            }

            sum += factorial;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a strong number.");
        } else {
            System.out.println(originalNum + " is not a strong number.");
        }
    }
}
