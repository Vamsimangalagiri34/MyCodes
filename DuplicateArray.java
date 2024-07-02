class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 3, 4, 4, 4, 423, 2, 637, 7, 7};
        boolean foundDuplicate = false; // Flag to check if there are any duplicates

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Loop through the elements that come after the current element
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the current element is equal to any of the subsequent elements
                if (arr[i] == arr[j]) {
                    // Print the duplicate element
                    System.out.print(arr[j] + " ");
                    foundDuplicate = true;
                    break; // Exit the inner loop to avoid printing the same duplicate multiple times
                }
            }
        }

        // If no duplicates were found, print a message indicating that
        if (!foundDuplicate) {
            System.out.println("No duplicates found");
        }
    }
}
