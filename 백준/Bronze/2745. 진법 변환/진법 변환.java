import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char[] N = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int idx = 0;
        int num = 0;
        for (int i = N.length - 1; i >= 0; i--) {
            if (N[i] >= '0' && N[i] <= '9') {
                num = N[i] - '0';
            }
            else{
                num = N[i] - 55;
            }
            sum = sum + num * (int) Math.pow(B, idx);
            idx++;
        }
        System.out.println(sum);
    }
}

