class Workspace {
    public static void main(String ar[]) {
      int arr[]={34,5,7,6,75,35,74,85,355};
      int fl=arr[0],sl=0,tl=0;
      
      for(int i=1;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(fl<arr[j]){
;
                int temp=fl;

                if(sl>tl){
                    tl=sl;
                }

                if(temp>sl){
                    sl=temp;
                }
                fl=arr[j];
            }
        }
      }
      System.out.println(fl+" "+sl+" "+tl);
      System.out.println(java.util.Arrays.toString(arr));
    }
}