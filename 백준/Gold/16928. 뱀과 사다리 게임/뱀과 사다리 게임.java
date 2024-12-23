import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] game = new int[101];   // 1~100번 칸 사용
        boolean[] visit = new boolean[101];

        initialize(game);
        settingGame(game, N, br); // 사다리 설정
        settingGame(game, M, br); // 뱀 설정

        int result = bfs(game, visit); // BFS로 최소 주사위 횟수 계산
        System.out.println(result);
    }

    public static void initialize(int[] game) {
        for (int i = 1; i <= 100; i++) {
            game[i] = i;
        }
    }

    public static void settingGame(int[] game, int input, BufferedReader br) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            game[x] = y; // 사다리나 뱀의 이동 설정
        }
    }

    public static int bfs(int[] game, boolean[] visit) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0}); // 시작점 (1번 칸, 주사위 횟수 0)
        visit[1] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];
            int diceCount = current[1];

            if (position == 100) {
                return diceCount; // 100번 칸 도달 시 주사위 횟수 반환
            }

            for (int i = 1; i <= 6; i++) { // 주사위 던지기 (1~6)
                int next = position + i;
                if (next <= 100 && !visit[next]) { // 범위 확인 및 방문 여부 체크
                    visit[next] = true;
                    queue.offer(new int[]{game[next], diceCount + 1}); // 사다리/뱀 이동 후 큐에 추가
                }
            }
        }
        return -1; // 도달 불가능한 경우
    }
}
