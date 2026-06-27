import java.util.*;

public class A2228 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;

            // Remove all 0's
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    count++;
                    arr[i] = -1;      
                }
            }

            for (int i = 0; i < n; i++) {

                if (arr[i] == 1) {

                    for (int j = 0; j < n; j++) {

                        if (arr[j] == 2) {
                            count++;
                            arr[i] = -1;   // use this 1
                            arr[j] = -1;   // use this 2
                            break;
                        }
                    }

                }

            }
            int one = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1)
                    one++;
            }

            count += one / 3;

            int two = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2)
                    two++;
            }

            count += two / 3;

            System.out.println(count);
        }
    }
}