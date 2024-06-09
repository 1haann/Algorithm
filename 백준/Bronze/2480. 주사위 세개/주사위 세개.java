import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int dice1 = 0, dice2 = 0, dice3 = 0;
        int result = 0, num = 0, maxValue = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        dice1 = Integer.parseInt(st.nextToken());
        dice2 = Integer.parseInt(st.nextToken());
        dice3 = Integer.parseInt(st.nextToken());

        //case1
        if (dice1 == dice2 && dice2 == dice3) {
            num = dice1;
            result = 10000 + (num * 1000);
        }
        //case2
        else if (dice1 == dice2 || dice1 == dice3) {
            num = dice1;
            result = 1000 + (num * 100);
        }
        else if (dice2 == dice3) {
            num = dice2;
            result = 1000 + (num * 100);
        }
        //case3
        else {
            maxValue = dice1 > dice2 ? dice1 : dice2;
            maxValue = maxValue > dice3 ? maxValue : dice3;
            result = maxValue * 100;
        }

        System.out.println(result);
    }
}