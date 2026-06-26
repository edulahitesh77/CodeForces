import java.util.*;
public class Team {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int count=0;
        int k;
        int t=sc.nextInt();
        int[] arr = new int[3];
        while(t-->0){

            k=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]==1){
                    k=k+1;
                }
            }

            if(k>=2){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
