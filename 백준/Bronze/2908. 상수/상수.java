import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int rA = 0;
        int rB = 0;
        int digit = 100;
        for (int i = 0; i < 3; i++) {
            rA = rA + ((A % 10) * digit);
            rB = rB + ((B % 10) * digit);
            digit = digit / 10;
            A = A / 10;
            B = B / 10;
        }
        System.out.println(Math.max(rA,rB));
    }
}
