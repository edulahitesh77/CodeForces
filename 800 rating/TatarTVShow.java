import java.util.*;

public class TatarTVShow {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();
            int k=sc.nextInt();

            String s=sc.next();
            
            for(int i=0;i<=n-k;i++){
                char s1=s.charAt(i);
                char s2=s.charAt(i+k);
                if(s1==1){
                    s1=0;
                }
                if(s1==0){
                    s1=1;
                }
                if(s2==1){
                    s1=0;
                }
                if(s2==0){
                    s1=1;
                }
            }

            int count=0;
            for(int i=0;i<s.length();i++){
                char s1=s.charAt(i);
                if(s1==0){
                    count=count+1;
                }
            }

            if(count==n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
