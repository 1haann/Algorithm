import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        int sum = 0;
        int tmp = 0;
        int num = 9;
        for(int i=0;i<alphabet.length;i++) {    // n^2
            int maxValueIdx = i;
            for(int j=i+1;j<alphabet.length;j++) {
                if(alphabet[maxValueIdx] < alphabet[j]){
                    maxValueIdx = j;
                }
            }
            //swap
            tmp = alphabet[i];
            alphabet[i] = alphabet[maxValueIdx];
            alphabet[maxValueIdx] = tmp;

            sum += alphabet[i] * num--;
        }
        System.out.println(sum);
    }
}
