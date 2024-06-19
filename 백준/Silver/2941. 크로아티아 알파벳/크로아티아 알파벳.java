import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();
        int i = 0, count = 0;
        int len = alphabet.length();
        while (i < len) {
            if (i + 3 <= len && alphabet.substring(i, i + 3).equals("dz=")) {       // case : dz=
                i = i + 3;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("d-")) {   // case : d-
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("c=")) {    // case : c=
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("c-")) {    // case : c-
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("lj")) {   // case : lj
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("nj")) {   // case : nj
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("s=")) {   // case : s=
                i = i + 2;
            } else if (i + 2 <= len && alphabet.substring(i, i + 2).equals("z=")) {   // case : z=
                i = i + 2;
            } else {
                i = i + 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
