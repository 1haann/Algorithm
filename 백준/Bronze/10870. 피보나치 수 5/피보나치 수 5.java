import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursion(N));
    }

    static int recursion(int Fn) {
        if (Fn == 0) {
            return 0;
        } else if (Fn == 1) {
            return 1;
        }
        int result = recursion(Fn - 1) + recursion(Fn - 2);
        return result;
    }
}
