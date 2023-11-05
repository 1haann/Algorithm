import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int H=0,M=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        if(45>M){
            H = H!=0 ? H-1:23;
            M = M + 60;
        }
        System.out.println(H + " " + (M-45));
    }
}