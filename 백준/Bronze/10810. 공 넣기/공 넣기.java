import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        int i = 0, j = 0, k = 0;

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for (int cnt = i - 1; cnt <= j - 1; cnt++) {
                basket[cnt] = k;
            }
        }
        for (int count = 0; count < N; count++) {
            System.out.print(basket[count] + " ");
        }
    }
}