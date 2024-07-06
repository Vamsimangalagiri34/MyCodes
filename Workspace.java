import java.util.*;
class Workspace{
    public static void main(String ae[]){
        String str="abaabaab";
        String lp="";
        int l=str.length();
        int ml=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                String sb=str.substring(i,j);
                if(isPlalindram(sb) && sb.length()>ml){
                    ml=sb.length();
                    lp=sb;
                }

            }
        }
    System.out.println(lp);
    }
        public static boolean isPlalindram(String sb){
            int l=0;
            int r=sb.length()-1;
            while(l<r){
                if(sb.charAt(l)!=sb.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
}