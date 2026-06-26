import java.util.*;

class Way2Long{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        String S=sc.next();
        int sil=S.length();

        if(sil>10){
            int c=sil-2;
            System.out.println(S.charAt(0) + "" + c + S.charAt(sil-1));
        }else{
            System.out.println(S);
        }
    }

    }
}