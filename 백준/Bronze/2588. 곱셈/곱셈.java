import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int result = 0 , num = 0;
        for(int i=0;i<3;i++){
            num = x * (y%10);
            System.out.println(num);
            result += num * Math.pow(10,i);
            y = y/10;
        }
        System.out.println(result);
    }
}
