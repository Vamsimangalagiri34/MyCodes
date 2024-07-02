class ExceptCenter{
    public static void main(String arf[]){
        int r=3,c=3;
        int mat[][]=new int[r][c];
        int t=1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=t;
                t++;
            }
        }
        mat[2][2]=89;
                    for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println(" ");
            }
        int l=r/2;
        int sum=0,sum2=0,ce=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(l==i){
                    ce=mat[l][l];
                    continue;
                }
                else if(i==j){
                    System.out.println("elements"+mat[i][j]);
                    sum+=mat[l][j];
                }
                else if(i==r-1-j){
                    System.out.println("ele"+mat[i][j]);
                     sum2+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(ce);

    }
}