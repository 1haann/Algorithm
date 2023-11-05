import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        short x=0,y=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        x = Short.parseShort(br.readLine());
        y = Short.parseShort(br.readLine());

        if(x>=0){   //1,4사분면
            if(y>=0) System.out.println(1); // 1사분면
            else System.out.println(4); // 4사분면
        }
        else{   //2,3사분면
            if(y>=0) System.out.println(2); // 2사분면
            else System.out.println(3); // 3사분면
        }
    }
}