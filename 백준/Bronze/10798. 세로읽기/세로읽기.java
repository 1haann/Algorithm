import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] chars = new char[5][];

        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            chars[i] = str.toCharArray();
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (chars[i].length - 1 >= j) {
                    System.out.print(chars[i][j]);
                }
            }
        }
    }
}
