class StrongNumber {
    public static void main(String agr[]) {

        int target=150;
for(int a=1;a<=target;a++){
    int num=a;
    int sum=0;
        while (num > 0) {
            int rem = num % 10;
            int factorial = 1;

            for (int i = 1; i <= rem; i++) {
                factorial *= i;
            }

            sum += factorial;
            num /= 10;
        }

        if (sum == a) {
            System.out.println(a + " is a strong number.");
        } 

        sum=0;
    }
    }
}
