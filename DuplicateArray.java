// class Workspace{
//     public static void main(String ad[]){
//         int arr[]={23,45,33,33,90,67,22,24,23};
//         int temp=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++ ){
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }
//     }
// }
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

// the inner loop depends on the outer loop and runs up to n times for each of the n iterations of the outer loop, the overall time complexity is 
// O(n2)

// This quadratic time complexity is common in algorithms that involve checking all pairs of elements in a list or array.

