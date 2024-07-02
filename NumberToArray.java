class NumberToArray{
    public static void main(String ae[]){
        int num=345463;
        String strNumber=Integer.toString(num);
        int digit[]=new int[strNumber.length()];
        for(int i=0;i<strNumber.length();i++){
            digit[i]=Character.getNumericValue(strNumber.charAt(i));
        }

        for(int d:digit){
        System.out.println(d);
        }
        
        System.out.println("sd"+strNumber.length()/2);
    }
}