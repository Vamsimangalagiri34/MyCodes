class Workspace2{
    public static void main(String ar[]){
        int arr[]={1,1,1,1,6,12,5,2,2,3,3,3,5,6,5,6,6,3,53,63,6};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}