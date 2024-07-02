class PritnABC{
    public static void main(String ae[]){
        int a=(int) 'A';
        int n=6;
        // a=a-1;
        int temp=a;
        System.out.println(a);
        for(int i=0;i<n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            for(int j=0;j<=i;j++){

                System.out.print((char) a+" ");
                a++;
            }
            a=temp;
            System.out.println();
        }
    }
}