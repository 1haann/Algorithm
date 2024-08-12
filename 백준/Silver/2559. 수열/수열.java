import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] input = new int[N];
        int sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < K; i++) {
            sum = sum + input[i];
        }
        int max = sum;

        for (int i = K; i < N; i++) {
            sum = sum + input[i] - input[i - K];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}

// NOTE K = 5일때 가정
// NOTE i = 2, arr[2] = input[2] + input[3] + input[4] + input[5] + input[6]
// NOTE i = 3, arr[3] =            input[3] + input[4] + input[5] + input[6] + input[7]
// NOTE i = 4, arr[4] =                       input[4] + input[5] + input[6] + input[7] + input[8]
// NOTE 즉 i번째부터 K일동안 온도의 합은 arr[i - 1] - input[i - 1] + input[i - 1 + K] 이다.
