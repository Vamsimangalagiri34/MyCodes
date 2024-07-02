class Equilateral_Triangle{
    public static void main(String a[]){
        int n = 9; // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Add spaces to center the stars
            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); // Leading spaces
            }

            // Add stars for the current row
            // for (int k = 0; k < (2 * i - 1); k++) {
                  for (int k = 0; k < i; k++) {
                System.out.print("* "); // Stars for the current row
            }

            System.out.println(); // New line for the next row
        }
    }
}