import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int count = 0; count < N; count++) {
            basket[count] = count + 1;
        }

        for (int count = 0; count < M; count++) {
            int front = 0, end = 0, tmp = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            front = i;
            end = j;
            while (front != end && front < end) {
                tmp = basket[front - 1];
                basket[front - 1] = basket[end - 1];
                basket[end - 1] = tmp;
                front++;
                end--;
            }
        }
        for (int n : basket) {
            System.out.print(n + " ");
        }
    }
}
