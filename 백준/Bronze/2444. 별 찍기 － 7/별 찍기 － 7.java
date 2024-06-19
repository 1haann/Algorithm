import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int blank = 0; blank < N - 1 - i; blank++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = N - 1; i > 0; i--) {
            for (int blank = 0; blank < N - i; blank++) {
                System.out.print(" ");
            }
            for (int star = i * 2 - 1; star > 0; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
