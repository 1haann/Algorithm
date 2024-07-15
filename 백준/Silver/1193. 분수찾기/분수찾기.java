import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int numerator = 1, denominator = 1;
        boolean toggle = true; // true : 분모값을 증가시킨다. false : 분자값을 증가시킨다.

        while (count < N) {
            if (numerator == 1 || denominator == 1) {   // 행 또는 열 이동
                if (toggle == true) {
                    denominator++;
                }
                if (toggle == false) {
                    numerator++;
                }
                count++;
            }

            while (toggle == true && denominator > 1 && count < N) {    // 대각선 이동
                denominator--;
                numerator++;
                count++;
            }
            while (toggle == false && numerator > 1 && count < N) {
                denominator++;
                numerator--;
                count++;
            }
            toggle = !toggle;
        }
        System.out.println(numerator + "/" + denominator);
    }
}
