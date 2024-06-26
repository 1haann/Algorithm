import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            char num;
            int remainder = N % B;
            if (remainder >= 0 && remainder <= 9) {
                num = (char) (remainder + '0');
            } else {
                num = (char) (remainder + 55);
            }
            stack.push(num);
            N = N / B;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
