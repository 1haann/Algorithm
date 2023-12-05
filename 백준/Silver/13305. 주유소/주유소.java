import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int city = Integer.parseInt(br.readLine());
        Long[] distance = new Long[city-1];
        Long[] gasStation = new Long[city];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<city-1;i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<city;i++) {
            gasStation[i] = Long.parseLong(st.nextToken());
        }

        Long minvalue = 0L;
        Long presentStation = gasStation[0];
        Long nextStation;
        for(int i=0;i<city-1;i++) {
            nextStation = gasStation[i+1];
            if(presentStation > nextStation) {  // 다음 주유소의 기름 값이 더 싼 경우 다음 주유소 도착까지 필요한 기름만 채움
                minvalue = minvalue + (presentStation * distance[i]); // 기름 값 지불
                presentStation = gasStation[i+1];   // 다음 주유소로 이동
            }
            else {  // 현재 주유소가 다음 주유소보다 싼 경우 현재 주유소의 기름 값보다 싼 주유소 도착까지 필요한 기름을 모두 채움
                minvalue = minvalue + (presentStation * distance[i]);
            }
        }
        System.out.println(minvalue);
    }
}
