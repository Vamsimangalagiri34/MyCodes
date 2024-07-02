class Diamond{
    public static void main(String ar[]){
        int n=9;
        //   System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(1*i)-1;k++){
                System.out.print(k);
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
          for(int k=n-i;k>=1;k--){
             System.out.print(" ");
          }
          for(int l=1;l<=(1*i)-1;l++){
            System.out.print(l);
          }
          for(int p=i;p>=1;p--){
            System.out.print("*");
          }
          System.out.println();
        }


    }
}