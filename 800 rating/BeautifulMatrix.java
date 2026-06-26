import java.util.*;


public class BeautifulMatrix {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int[][] arr=new int[5][5];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(arr[i][j]==1){
                    count=Math.abs(i-2)+Math.abs(j-2);
                }
            }
        }

        System.out.println(count);
    }
}
