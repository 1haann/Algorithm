import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine(), " ");
        // NOTE : 누적합을 이용합니다. i번째에는 새로 받은 값과 i - 1번째의 값의 합이 들어갑니다
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }

        // NOTE : i번 인덱스에는 0 ~ i번까지의 합이 들어있습니다.
        // NOTE : ex) 5,4,3,2,1 입력 시 각 인덱스
        // NOTE : idx   0  1   2     3       4         5
        // NOTE :       0, 5, 5+4, 5+4+3, 5+4+3+2, 5+4+3+2+1
        // NOTE : 2 ~ 4번 수의 합을 구하려면 4번 인덱스의 값( 0 ~ 4까지의 누적합)에서 2 - 1인덱스의 값(0 ~ 2 - 1번째까지의 누적합)을 뺍니다  
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            System.out.println(arr[e] - arr[s - 1]);
        }
    }
}
