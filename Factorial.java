class Factorial{
    public static void main(String srg[]){
        int num=5;
        int fac=1;
        for(int i=1;i<=num;i++){
           fac=fac*i;
           System.out.println(fac);
        }
        System.out.print(fac);
    }
}
//The factorial of a number is the product of all positive integers less than or equal to that number. It is denoted by the symbol n!,
// Since the loop runs n times and all operations within the loop are constant time, the overall time complexity is O(n).