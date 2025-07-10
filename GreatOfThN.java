class GreatOfThN{
    public static void main(String args[]){
        int a=34,b=44,c=333;
        if(a>b){
            if(a>c)
            System.out.print('a');
        }
        else if(b>c){
            if(b>a)
            System.out.println('b');
        }
        else{
            System.out.println('c');
        }
    }
}
// The time complexity of your code is O(1)