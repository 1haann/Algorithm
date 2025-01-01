import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());   // 총 책의 개수
        int M = Integer.parseInt(st.nextToken());   // 한번에 들 수 있는 책의 개수
        ArrayList<Integer> negativeArea = new ArrayList<>();
        ArrayList<Integer> positiveArea = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < N; i++) {
            int book = Integer.parseInt(st.nextToken());
            if (book < 0) {
                negativeArea.add(Math.abs(book));
            }
            else {
                positiveArea.add(book);
            }
        }

        Collections.sort(positiveArea, Collections.reverseOrder());
        Collections.sort(negativeArea, Collections.reverseOrder());

        int move = 0;
        for (int i = 0; i < positiveArea.size(); i = i + M) {
            move += positiveArea.get(i) * 2;
        }
        
        for (int i = 0; i < negativeArea.size(); i = i + M) {
            move += negativeArea.get(i) * 2;
        }

        int maxValue = 0;
        int maxPositiveValue = 0;
        int maxNegativeValue = 0;
        
        if (!positiveArea.isEmpty()) {
            maxPositiveValue = positiveArea.get(0);
        }
        if (!negativeArea.isEmpty()) {
            maxNegativeValue = negativeArea.get(0);
        }

        if (maxPositiveValue > maxNegativeValue) {
            maxValue = maxPositiveValue;
        }
        else {
            maxValue = maxNegativeValue;
        }

        System.out.println(move - maxValue);
    }
}

