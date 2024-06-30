import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if (N == 0) {
            System.out.println(0);
        } else if (N == 1) {
            System.out.println(1);
        } else {
            System.out.println(recursion(0, 0, 1));
        }
    }
    static int N;

    static int recursion(int cnt, int Fn1, int Fn2) {
        if (cnt > N-2) {
            return Fn2;
        }
        return recursion(++cnt, Fn2, Fn1 + Fn2);
    }
}
