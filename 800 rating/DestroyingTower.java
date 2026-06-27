import java.util.*;
public class DestroyingTower {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){

            int s=sc.nextInt();
            int[] arr=new int[s];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){

                    if(j>i && arr[j]>arr[i]){

                        arr[j]=arr[i];
                        break;
                    }

                }
            }

            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }

            System.out.println(sum);
        }
    }
}
