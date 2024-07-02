import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    // Define arrays for integer to Roman numeral mappings
    private static final int[] INTEGERS = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private static final String[] ROMAN_NUMERALS = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    // Method to convert integer to Roman numeral
    public static String integerToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999 inclusive.");
        }

        StringBuilder romanNumeral = new StringBuilder();
        int index = INTEGERS.length - 1; // Start from the largest integer
        while (num > 0) {
            if (num >= INTEGERS[index]) {
                romanNumeral.append(ROMAN_NUMERALS[index]);
                num -= INTEGERS[index];
            } else {k
                index--; // Move to the next smaller integer
            }
        }
        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        int num = 2856;

        // Print the Roman numeral representation
        System.out.println("Roman numeral representation for " + num + ": " + integerToRoman(num));
    }
}
