class LeapYear{
    public static void main(String arg[]){
        int num=2025;
        if(num%4==0 || (num%400==0 && num%100!=0)){
            System.out.print("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}