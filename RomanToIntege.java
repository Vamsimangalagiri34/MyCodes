import java.util.*;
class RomanToIntege{
    public static int toInteger(String nums){
        int arr[]={1,4,5,9,10,90,100,400,500,900,1000};
        String arr2[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        char crr[]=nums.toCharArray();
        int intg=0;
         for(int i=crr.length-1;i>=0;i++){
            int nk=nums.charAt(i);
            
                intg=intg+arr[i];

            

         }
         return intg;
    }
    public static void main(String ae[]){
   System.out.println(toInteger("X"));
    }
}