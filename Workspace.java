import java.util.*;
class Workspace{
    public static void main(String ar[]){
        int target=5;
        int n1=0,n2=1,n3=0;
        for(int i=2;i<=target;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            //  System.out.print(n3);
        }
       
    }
}