import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int Quarter = 25, Dime = 10, Nickel = 5, Penny = 1;
        // 입력이 정수(센트)로 들어오기 때문에 계산하기 쉽게 거스름돈(달러)로 센트로 만들어서 계산
        
        for (int i = 0; i < T; i++) {
            int Q, D, N, P;
            int C = Integer.parseInt(br.readLine());
            Q = C / Quarter;
            C = C % Quarter;

            D = C / Dime;
            C = C % Dime;

            N = C / Nickel;
            C = C % Nickel;

            P = C / Penny;
            C = C % Penny;

            System.out.println(Q + " " + D + " " + N + " " + P + " ");
        }
    }
}
