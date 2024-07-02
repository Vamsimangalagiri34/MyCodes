import java.util.*;
class Max_Sum_Arr{//maximum subarray sum
    public static void main(String ae[]){
    int arr[]={1,3,5,7,9};
    int sum=0;//kadaons algo
    int max=0;
    List<Integer> l=new LinkedList<>();
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum<0){
            sum=0;
        }
        if(sum>max){
             l.add(arr[i]);
            max=sum;
        }
    }
    System.out.print(max);
    System.out.print(l);
 }
    //  }https://www.youtube.com/watch?v=GpK2mUCQV7U&list=PLPzfPcir5uPRDU2g_-Rv1ay9ivMcY_wzh&ab_channel=NGTutorials
}