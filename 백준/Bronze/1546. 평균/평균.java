import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] exam = new int[N];
        int highScore = 0;
        for (int i = 0; i < N; i++) {
            exam[i] = Integer.parseInt(st.nextToken());
            if (exam[i] > highScore) {
                highScore = exam[i];
            }
        }

        double newMyScore = 0.0;
        for (int i = 0; i < N; i++) {
            double subject = Double.parseDouble(Integer.toString(exam[i]));
            newMyScore = newMyScore + (subject / highScore * 100);
        }
        System.out.printf("%.2f",newMyScore / N);
    }
}
