import java.util.*;

public class NextRound {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[t];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=arr[k-1] && arr[i]!=0){
                count=count+1;
                break;
            }
        }
        System.out.println(count);
    }
}
