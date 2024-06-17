import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] ch = S.toCharArray();
        int[] N = new int[26];

        for (int i = 0; i < N.length; i++) {    // -1로 초기화
            N[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            //baekjoon에서 중복되는 o는 먼저나온 idx:5가 들어가야 한다.
            //그래서 이미 들어간 알파벳 위치는 변경하지 않도록 if문 작성
            if(N[ch[i] - 'a'] == -1) {
                N[ch[i] - 'a'] = i;   
            }
        }
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
    }
}
