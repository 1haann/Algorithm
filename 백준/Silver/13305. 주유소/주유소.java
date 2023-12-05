import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());

        String[] distance = br.readLine().split(" ");
        if(distance.length > city-1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        String[] gasStation = br.readLine().split(" ");
        if(gasStation.length > city) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int presentStation = Integer.parseInt(gasStation[0]);
        int nextStation;
        int minvalue = 0;
        for(int i=0;i<city-1;i++) {
            nextStation = Integer.parseInt(gasStation[i+1]);
            if(presentStation > nextStation) {  // 다음 주유소의 기름 값이 더 싼 경우 다음 주유소 도착까지 필요한 기름만 채움
                minvalue = minvalue + (presentStation * Integer.parseInt(distance[i])); // 기름 값 지불
                presentStation = Integer.parseInt(gasStation[i+1]);   // 다음 주유소로 이동
            }
            else {  // 현재 주유소가 다음 주유소보다 싼 경우 현재 주유소의 기름 값보다 싼 주유소 도착까지 필요한 기름을 모두 채움
                minvalue = minvalue + (presentStation * Integer.parseInt(distance[i]));
            }
        }
        System.out.println(minvalue);
    }
}
