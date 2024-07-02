import java.util.*;

class MinMaxSum {
    public static void minmax(List<Integer> l) {
        long sum = 0;
        for (Integer a : l) {
            sum += a;
        }
        
        long minSum = sum - l.get(0);
        long maxSum = sum - l.get(0);
        
        // The goal is to initialize minSum and maxSum to a value that represents the sum of four elements out of the five in the list,
        // initially excluding the first element. This provides a starting point for comparison as we iterate through the list.
        for (Integer num : l) {
            long currentSum = sum - num;
            if (currentSum < minSum) {
                minSum = currentSum;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {  // Since we are summing 4 out of 5 numbers
            l.add(scan.nextInt());
        }
        minmax(l);
        scan.close();
    }
}


///-----------------------or---------------
//it is suitable for small values only it cont hold suitable for 32 bits numbers
// import java.util.*;
// class MinMaxSum{
//     public static void main(String ae[]){
//     int n=5;
//     int arr[]={1,2,3,4,5};
//     int temp=0;
//     List<Integer> l=new ArrayList<>();
//     for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr.length;j++){
//             if(i==j){
//                 continue;
//             }
//             else{
//                 temp=temp+arr[j];
//             }
//         }
//         l.add(temp);
//         temp=0;
//     }
//     Collections.sort(l);
//     System.out.println(l.get(0)+" "+l.get(n-1));
//     }
// }
