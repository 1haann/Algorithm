import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        int i = 0, flag = 0 , cnt = 0 , ticket = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] Sub_lane = new int[N];
        int[] Main_lane = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());    //StringTokenizer : 문자열 파싱 클래스
        for(int j=0;j<N;j++){
            Main_lane[j] = Integer.parseInt(st.nextToken());
        }

        while(i < N) {
            if(Main_lane[i] == ticket) {    //현재 대기열에 다음 순서가 있는 경우
                ticket++;
                i++;
            }
            else {
                if(cnt == 0) {   //예비열이 비어있는 경우
                    Sub_lane[cnt] = Main_lane[i];
                    cnt++;
                    i++;
                }
                else { //예비열에 사람이 있는 경우
                    if (Sub_lane[cnt - 1] == ticket) {  //예비열에 다음 순서가 있는 경우
                        ticket++;
                        cnt--;
                    }
                    else {   //예비열에 다음 순서가 없는 경우
                        Sub_lane[cnt] = Main_lane[i];
                        cnt++;
                        i++;
                    }
                }
            }
        }
        for(i=cnt-1;i>=0;i--){  //예비열 확인
            if(Sub_lane[i] == ticket) {
                ticket++;
            }
            else {  //Sub_lane[i] != ticket
                flag = 1;
                break;
            }
        }
        if(flag == 1) System.out.println("Sad");
        else System.out.println("Nice");
    }
}
//반례 6 6 1 4 3 2 5