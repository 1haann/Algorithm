import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arrN);

        for(int i=0;i<M;i++) {
            int start = 0, end = N - 1;;
            int mid = (start + end) / 2;
            int flag = 0;

            while (start<=end) {
                if(arrM[i] > arrN[mid]) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
                else if(arrM[i] < arrN[mid]) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
                else {  //arrM[i] == arrN[idx]
                    flag = 1;
                    break;
                }
            }
            System.out.print(flag + " ");
        }
    }
}
