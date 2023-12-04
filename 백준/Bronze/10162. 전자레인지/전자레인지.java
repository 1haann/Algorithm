import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] button = new int[3];
        int time = Integer.parseInt(str);

        if(time >= 300){
            button[0] = time / 300;
            time = time % 300;
        }
        if(time >= 60){
            button[1] = time / 60;
            time = time % 60;
        }
        if(time >= 10){
            button[2] = time / 10;
            time = time % 10;
        }

        if(time != 0){
            System.out.println(-1);
        }
        else {
            for (var res : button) {
                System.out.print(res + " ");
            }
        }
    }
}
