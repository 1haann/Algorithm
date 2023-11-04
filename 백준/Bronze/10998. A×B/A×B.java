import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] result = str.split(" "); // split : 특정 문자를 기준으로 문자열을 나누어 배열에 저장
        System.out.println(Integer.parseInt(result[0]) * Integer.parseInt(result[1]));
    }
}
