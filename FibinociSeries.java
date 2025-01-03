class Workspace {
    public static void main(String ar[]) {
        int n1 = 0, n2 = 1, n3;
        int num = 5; // This is the count of Fibonacci numbers to generate
        int sum = n1 + n2; // Start the sum with the first two Fibonacci numbers

        System.out.print(n1 + " " + n2 + " "); // Print the first two Fibonacci numbers

        for (int i = 2; i <=num; i++) { // Start from index 2 since we already printed 0 and 1
            n3 = n1 + n2; // Calculate the next Fibonacci number
            System.out.print(n3 + " "); // Print the current Fibonacci number
            sum += n3; // Add it to the sum
            
            // Update n1 and n2 for the next iteration
            n1 = n2;
            n2 = n3;
        }

        System.out.println("\nSum of Fibonacci numbers up to " + num + " is " + sum); // Print the sum of the Fibonacci numbers
    }
}