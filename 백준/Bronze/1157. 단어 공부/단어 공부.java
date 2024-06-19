import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        char[] ch = word.toCharArray();
        int[] alphabet = new int[26];
        int maxIdx = 0;
        Boolean flag = false;

        for (int i = 0; i < ch.length; i++) {
            alphabet[ch[i] - 'A']++;
        }

        for (int i = 1; i < alphabet.length; i++) {
            if (alphabet[i] > alphabet[maxIdx]) {
                maxIdx = i;
                flag = false;
            } else if (alphabet[i] == alphabet[maxIdx]) { // 알파벳 개수가 중복되는 경우
                flag = true;
            }
        }
        if (flag == true) { // 가장 많이 사용된 여러 개 존재하는 경우 ? 출력
            System.out.println("?");
        } else {
            System.out.println((char)('A'+maxIdx));
        }
    }
}
