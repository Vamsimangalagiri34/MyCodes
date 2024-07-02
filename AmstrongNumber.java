import java.util.*;
class AmstrongNumber{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);//sum of cude of digit 153 371
    int num,rev,sum=0,temp;
    num=153;
    temp=num;
    while(num>0){
        rev=num%10;
        sum=rev*rev*rev+sum;
        num/=10;
    }
    if(temp==sum){
        System.out.println("amstrong number");
    }
    else{
        System.out.println("not a amstrong number");
    }
    }
}