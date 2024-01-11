import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int result = 0;
    static int[][] computers;
    static boolean[] visited;

    static void dfs(int node) {

        visited[node] = true;  // visited

        for (int i = 1; i <= N; i++) {
            if (computers[node][i] == 1 && visited[i] == false) { // 연결되어 있으며 방문한 적 없는 경우
                result++;
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());    // 컴퓨터 수
        M = Integer.parseInt(br.readLine());    // 컴퓨터 쌍의 수
        computers = new int[N + 1][N + 1];  // 인덱스 0은 사용x
        visited = new boolean[N + 1];

        for(int i=0;i<M;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            computers[c1][c2] = 1;  // 1 : 연결 되어있는 상태
            computers[c2][c1] = 1;
        }
        dfs(1);
        System.out.println(result);
    }
}
