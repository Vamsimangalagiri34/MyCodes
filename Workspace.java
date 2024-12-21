class Workspace{
    public static void main(String arg[]){
        int num=153;
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*rem*rem;
            num/=10;
        }
        System.out.println(sum==temp?"amstrong":"not a amstrong");
        
    }
}