import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] input = new int[3];
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    if (h != m && h != s && m != s && verification(input[h], input[m], input[s])) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean verification(int h, int m, int s) {
        if ((h >= 1 && h <= 12) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
            return true;
        } else {
            return false;
        }
    }
}