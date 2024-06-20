import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        //  Arrays.sort()는 dual-pivot Quicksort 알고리즘 사용
        //  Arrays.sort()를 사용하면 최악의 경우 시간복잡도는 O(n^2)로 시간초과 발생
        Collections.sort(list);
        
        for (int i = 0; i < N; i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
