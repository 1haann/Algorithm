import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N; i++) {
            sb.append(" ");
        }
        for (int i = N - 1; i >= 0; i--) {
            sb.setCharAt(i,'*');
            System.out.println(sb);
        }
    }
}