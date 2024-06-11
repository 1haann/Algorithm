import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 처음 들어오는 값을 min,max값으로 설정하고 이후에 들어오는 값들과 비교
        int firstValue = Integer.parseInt(st.nextToken());
        int minValue = firstValue, maxValue = firstValue;

        for (int i = 1; i < N; i++) { // 두번째로 들어오는 값부터 시작하여 비교
            int inputValue = Integer.parseInt(st.nextToken());
            if (minValue > inputValue) {
                minValue = inputValue;
            }
            if (maxValue < inputValue) {
                maxValue = inputValue;
            }
        }
        System.out.println(minValue + " " + maxValue);
    }
}