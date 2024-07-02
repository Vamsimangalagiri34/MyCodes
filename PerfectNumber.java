import java.util.*;
class PerfectNumber{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       int n=28,sum=0;//sum of factors of its number --28
       //n=scan.nextInt();
       for(int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;
        }
       }
       if(sum==n)
       System.out.printf("%d is perfect number  %d",n,sum);
       else
       System.out.printf("%d is not a perfect number",n);
    }
}