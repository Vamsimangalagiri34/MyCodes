import java.util.*;

class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 6, 7736, 35};
        int target = 7; // The target value for the sum of pairs

        // Use a HashSet to quickly check if a value's complement exists
        Set<Integer> seen = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num; // Calculate the complement needed to reach the target
            if (seen.contains(complement)) {
                // If the complement exists, add the pair to the list
                pairs.add(new int[]{complement, num});
            } else {
                // Otherwise, add the current number to the seen set
                seen.add(num);
            }
        }

        // Output the pairs found that sum up to the target value
        if (pairs.isEmpty()) {
            System.out.println("No pairs found that sum to " + target);
        } else {
            System.out.println("Pairs that sum to " + target + ":");
            for (int[] pair : pairs) {
                System.out.println(pair[0] + ", " + pair[1]);
            }
        }
    }
}
