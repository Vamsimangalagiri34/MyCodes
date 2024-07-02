class ZeroTOOne{
    public static void main(String args[]){
        int num=30020030;
        String sr=Integer.toString(num);
        char ch[]=sr.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
            }
        }
        for(int j=0;j<ch.length;j++){
        System.out.print(ch[j]);
        }
        String str=new String(ch);
        System.out.println(" "+num);
        }
    }
