import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] chess = new int[]{1, 1, 2, 2, 2, 8};  // 0:king 1:queen 2:rook 3:bishop 4:knight 5:pawn

        for (int i = 0; i < 6; i++) {
            chess[i] = chess[i] - Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(chess[i] + " ");
        }
    }
}
