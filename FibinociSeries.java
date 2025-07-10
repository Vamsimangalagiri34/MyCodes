class Workspace {
    public static void main(String ar[]) {
        int n1 = 0, n2 = 1, n3;
        int num = 5; // This is the count of Fibonacci numbers to generate
        int sum = n1 + n2; // Start the sum with the first two Fibonacci numbers

        System.out.print(n1 + "f " + n2 + " "); // Print the first two Fibonacci numbers

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

// // Since the loop runs n times and each operation inside the loop is constant time, the overall time complexity of the code is O(n).
// When we say that calculating the next Fibonacci number (n3 = n1 + n2) is a constant time operation (O(1)), we mean that it takes a fixed amount of time to perform, regardless of the size of the input.

// Here's why:

// Addition Operation: The operation n3 = n1 + n2 involves adding two integers (n1 and n2). Regardless of the values of n1 and n2, the time it takes to perform this addition is constant. It doesn't grow with the size of the input; it remains the same.

// Assignment Operation: Assigning the result to n3 is also a constant time operation. It doesn't depend on the value of n3 or the size of the input.

// In summary, both the addition and assignment operations are simple, fixed-time operations. This is why they are considered O(1). No matter how large or small the Fibonacci numbers are, the time required to compute the next Fibonacci number in this manner is always constant.