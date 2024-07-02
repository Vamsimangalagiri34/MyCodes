class ReverseNumber{
    public static void main(String e[]){
        int num=345;
        int rem=0,rev=0;
        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;       
            System.out.println(rem); 
            }
            
             System.out.println(rev);
    }
   
}