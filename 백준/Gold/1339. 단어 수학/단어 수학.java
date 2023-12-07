import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];   // 0(A) ~ 25(Z)로 알파벳 개수만큼 할당
        int N = Integer.parseInt(br.readLine());
        char[][] word = new char[N][];

        for(int i=0;i<N;i++) {
            word[i] = br.readLine().toCharArray();
        }

        for(char[] arr : word){
            int len = arr.length - 1;
            for(char ch : arr){
                alphabet[ch-'A'] += (int)Math.pow(10,len--);
            }
        }

        Arrays.sort(alphabet);
        int idx = 25;
        int sum = 0;
        int num = 9;
        while(alphabet[idx] != 0) { //Arrays.sort로 오름차순 정렬, 0이 나오기 전까지 각 값에 9~1값을 곱하여 최대합 만들기
            sum += alphabet[idx] * num;
            num--;
            idx--;
        }
        System.out.println(sum);
    }
}
