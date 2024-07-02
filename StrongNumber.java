class StrongNumber{
    public static void main(String agr[]){
        int num=145;//some of factorial of numbers is called perfect number
        int sum=0;
        int rev=0,temp=0;
        int rem;
        int res=1;
        
       while(num>0){
        rem=num%10;
        for(int i=1;i<=rem;i++){
            rev=res*i;
           
        }
        num/=10;
       }
       System.out.println(rev);
       }
    }
    