import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        int i = 0, j = 0, tmp = 0;

        for (int count = 0; count < N; count++) {   // 1~N개의 바구니에 번호
            basket[count] = count + 1;
        }

        for (int count = 0; count < M; count++) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            tmp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = tmp;
        }
        for (int count = 0; count < N; count++) {
            System.out.print(basket[count] + " ");
        }
    }
}
