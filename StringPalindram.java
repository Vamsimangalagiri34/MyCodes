class StringPalindram {
    public static void main(String ae[]) {
        String str = "aba";
        StringBuilder reversedStr = new StringBuilder(); // Using StringBuilder for efficient string manipulation

        char c[] = str.toCharArray();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            reversedStr.append(c[i]);
        }

        if (str.equals(reversedStr.toString())) {
            System.out.println("\nThe string is a palindrome.");
        } else {
            System.out.println("\nThe string is not a palindrome.");
        }
    }
}
