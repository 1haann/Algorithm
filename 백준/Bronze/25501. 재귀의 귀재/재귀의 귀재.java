import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            int l = 0, r = S.length() - 1;
            count = 0;
            System.out.println(recursion(S, l, r) + " " + count);
        }
    }
    static int count = 0;
    static int recursion(String S, int l, int r) {
        count++;
        if (l >= r) {  // 같은 인데스거나 교차한경우 Palindrome
            return 1;
        }

        if (S.charAt(l) != S.charAt(r)) { // Palindrome이 아닌 경우
            return 0;
        }

        return recursion(S, l + 1, r - 1);
    }
}
