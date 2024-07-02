import java.util.Scanner;

public class ArrayDestructuringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three space-separated integers:");
        // Read the input line and split it into an array
        String input = scanner.nextLine();
        String[] parts = input.split(" "); // Split on spaces

        // Convert the string parts into integers and store in an array
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // Destructure the array into individual variables
        int a = numbers[0]; // First variable
        int b = numbers[1]; // Second variable
        int c = numbers[2]; // Third variable

        // Print the variables to verify
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
