import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        int[][] dp = new int[n][];

        for (int i = 0; i < n; i++) {
            dp[i] = new int[i + 1];
            arr[i] = new int[i + 1];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(i == n - 1)
                    dp[i][j] = arr[i][j];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for(int j=0,max=0;j<arr[i].length;j++) {
                dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + arr[i][j];
            }
        }
        System.out.println(dp[0][0]);
    }
}
