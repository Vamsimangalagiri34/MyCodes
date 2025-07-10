import java.util.Scanner;
class HashardNumber{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num,rev,res=0;// a number which is divsible by sum of its number it is said to be hashard number-->(21/2+1),153,4991 and soon!
        num=scan.nextInt();// 0 is true and 1 is false
        int temp=num;
        while(num>0){
            rev=num%10;
            res=res+rev;
            num/=10;
        }
        if(temp%res==0){
            System.out.println("hashard number");
        }
        else
        System.out.println("not a hashard number");
    }
}


// The time complexity of your Harshad (or Hashard) number code is O(d), where 
// 𝑑
//  is the number of digits in the number num.