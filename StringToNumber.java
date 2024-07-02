class StringToNumber{
    public static void main(String ar[]){
        int num1=2356;
        String num2=Integer.toString(num1);
        char c[]=num2.toCharArray();
       for(int i=0;i<c.length;i++){
        System.out.println(Character.getNumericValue(c[i]));
       }

    }
}