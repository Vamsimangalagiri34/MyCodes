class Even{
    public static void main(String args[]){
        int num=10;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                System.out.println("not a even"+i);
            }
        }
    }
}

// Since all operations within the loop run in constant time, and the loop itself runs n times, the overall time complexity is O(n).