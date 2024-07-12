import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dot = 0;
        for (int i = 1; i <= N; i++) {
            int square = (int) Math.pow(4, i);
            dot = (int) Math.sqrt(square) + 1;
        }
        System.out.println(dot * dot);
    }
}
