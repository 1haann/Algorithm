import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int A = 0, B = 0 , C = 0;
        int hour = 0 ,minute = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());

        minute = B + C;
        hour = minute / 60;
        hour = (hour + A) % 24;

        minute = minute % 60;
        System.out.print(hour + " " + minute);
    }
}