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
