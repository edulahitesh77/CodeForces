import java.util.*;
public class Bit {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int X=0;
        while(t-->0){
            String S=sc.next();
            int sil=S.length();
            if (S.charAt(0) == '+') {
                X=X+1;
            }
            if(S.charAt(0) == '-'){
                X=X-1;
            }
            if(S.charAt(0)=='X' && S.charAt(sil-1)=='-'){
                X=X-1;
            }
            if(S.charAt(0)=='X' && S.charAt(sil-1)=='+'){
                X=X+1;
            }
        }
        System.out.println(X);
    }
}
