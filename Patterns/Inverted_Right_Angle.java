class Inverted_Right_Angle{
    public static void main(String rt[]){
        int n=4;
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}