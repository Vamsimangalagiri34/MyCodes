class Matrix{
    public static void main(String k[]){
        int rows=4;
        int cols=4;
        int mat[][]=new int[rows][cols];
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         mat[i][j]=0;
        //     }
        //     System.out.println(" ");
        // }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println(" ");
        }
    }
}