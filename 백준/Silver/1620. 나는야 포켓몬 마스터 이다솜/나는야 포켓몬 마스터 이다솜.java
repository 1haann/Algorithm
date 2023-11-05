import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int idx = 0;
        String input;
        Map<Integer, String> pokemon = new HashMap<>();
        Map<String, Integer> num = new HashMap<>();
        
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            pokemon.put(i, name);
            num.put(name,i);
        }

        for (int i = 1; i <= M; i++) {
            input = br.readLine();
            try {
                idx = Integer.parseInt(input);
                System.out.println(pokemon.get(idx));
            }catch(NumberFormatException e){
                System.out.println(num.get(input));
            }
        }
    }
}