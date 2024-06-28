import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        // 삽입정렬 사용, 배열의 i ~ N 까지 내림차순으로 정렬
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {    // arr[j - 1] >= arr[j]
                    break;
                }
            }
        }
        System.out.println(arr[k - 1]);
    }
}
