import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int lastNum = 0;
        Queue queue = new LinkedList();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            if (order.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                queue.add(X);
                lastNum = X;
            }
            else if (order.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.poll() + "\n");
                }
            }
            else if (order.equals("size")) {
                sb.append(queue.size() + "\n");
            }
            else if (order.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }
            else if (order.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(queue.peek() + "\n");
                }
            }
            else if (order.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(lastNum + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}