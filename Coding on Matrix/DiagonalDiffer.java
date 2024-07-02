class DiagonalDiffer {
    public static void main(String arg[]) {
        int r = 3, c = 3; // Defining dimensions of the matrix
        int mat[][] = new int[r][c]; // Creating a 3x3 matrix
        int val = 1;
        int d1=0,d2=0;
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]=val;
            val++;
        }
       }
       for(int i=0;i<r;i++){
           d1+=mat[i][i];
       }
       int b=r-1;
       for(int i=0;i<r;i++){
        d2+=mat[i][(b)];
        b--;
       }
       System.out.println(d1);
       System.out.println(d2);
       System.out.println("df is "+Math.abs(d1-d2));
    }
}
