import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] b = new int[15];  // idx 0은 사용x idx 1 ~ 14까지 사용

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            for(int j=0;j<=k;j++) { // 0층부터 k층까지
                for (int idx = 1; idx <= n; idx++) { //1호부터 n호까지
                    if(j == 0)  // 0층은 각 idx호마다 idx명이 산다. 
                        b[idx] = idx;
                    else
                        b[idx] = b[idx - 1] + b[idx]; // a층의 b호 = (a층 b-1호)+(a-1층 b호)
                }
            }
            System.out.println(b[n]);
        }

    }
}
