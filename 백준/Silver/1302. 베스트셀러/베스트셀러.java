import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            list.add(input);
        }

        Object[] array = list.toArray();
        Arrays.sort(array);

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (array[i].equals(array[j])) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
                maxIdx = i;
            }
        }
        System.out.println(array[maxIdx]);
    }
}