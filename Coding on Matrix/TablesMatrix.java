class TablesMatrix{
    public static void main(String ae[]){
        int r=4,c=4;
        int mat[][]=new int [r][c];
        int t=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=t*2;
                t++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}