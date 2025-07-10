 class FactorialUsingRecursion {

   public static int factorial(int n){
      
      if(n==1 || n==0){
        return 1;
      }
      return n*factorial(n-1);
     
   }
   public static void main(String ae[]){
    int n=5;
    int fac=factorial(n);
    System.out.print(fac);
   }
}

Since there are n recursive calls and each call performs a constant amount of work (a multiplication and a function call), the overall time complexity is O(n).

// The misconception might come from algorithms like binary search, where each recursive call reduces the problem size by half, leading to O(log n) time complexity. However, in the case of your recursive factorial function, the problem size is reduced by 1 in each call, leading to a linear time complexity, O(n).