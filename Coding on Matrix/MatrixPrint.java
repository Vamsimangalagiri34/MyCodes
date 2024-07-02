class MatrixPrint{
    public static void main(String ae[]){
        int rows=3,cols=3;
        int val=1;
        int mat[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               mat[i][j]=val;
               val++;
            }
            
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}