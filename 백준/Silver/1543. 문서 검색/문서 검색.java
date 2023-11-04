import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String find = br.readLine();
        int i = 0 , count = 0;
        while(i<=document.length()-find.length()) {
            if (find.equals(document.substring(i, i + find.length()))) {
                count++;
                i = i + find.length();
            } else {
                i = i + 1;
            }
        }
        System.out.println(count);
    }
}