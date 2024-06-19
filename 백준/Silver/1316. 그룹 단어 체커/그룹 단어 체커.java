import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        int N = 3;
        int count = 0;

        String[] str = new String[]{"aba","abab", "a"};
        for (int i = 0; i < N; i++) {
            char[] ch = br.readLine().toCharArray();
//            char[] ch = str[i].toCharArray();
            char word = ch[0];
            int j = 1;
            Boolean[] alphabet = new Boolean[26];
            Boolean flag = false;
            while (j < ch.length) {
                if (word != ch[j]) {    // 알파벳이 연속해서 나타나다 다른 알파벳을 만난 경우
                    if (alphabet[word - 'a'] == null) {    // null : 이전에 나온 적 없는 경우
                        alphabet[word - 'a'] = true;       // true로 변경하여 이전에 나왔던 알파벳으로 표시
                        word = ch[j];   // 새로 나온 알파벳을 기준으로 정함
                    }
                    else {  // 이전에 나온 적이 있는 경우(그룹 단어가 아닌 경우)
                        flag = true;
                        break;  // 그룹단어가 아니므로 카운팅 X
                    }
                }
                j++;
            }
            if (alphabet[word - 'a'] != null) {
                flag = true;
            }
            if (flag == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
