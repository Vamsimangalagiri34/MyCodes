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

class PairSum {
    public static void main(String ar[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 6, 7736, 35};
        int target = 7;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(arr[i] + " " + arr[j]);
                    System.out.println();
                }
            }
        }
    }
}


import java.util.*;
class Workspace {
    public static void main(String ar[]) {
      int arr[]={3,4,7,5,1,9,2,3};
      Set<Integer> set=new HashSet<>();
      for(int ele:arr){
        set.add(ele);
      }
      int target=7;
      for(int ele : set){
        int temp=Math.abs(target-ele);
        if(set.contains(ele) && temp+ele==target){
            System.out.println(ele+" "+temp);
        }
      }
    }
}