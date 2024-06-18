import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int needTime = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C') {
                needTime = needTime + 3;
            } else if (ch[i] == 'D' || ch[i] == 'E' || ch[i] == 'F') {
                needTime = needTime + 4;
            } else if (ch[i] == 'G' || ch[i] == 'H' || ch[i] == 'I') {
                needTime = needTime + 5;
            } else if (ch[i] == 'J' || ch[i] == 'K' || ch[i] =='L') {
                needTime = needTime + 6;
            } else if (ch[i] == 'M' || ch[i] == 'N' || ch[i] == 'O') {
                needTime = needTime + 7;
            } else if (ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R' || ch[i] == 'S') {
                needTime = needTime + 8;
            } else if (ch[i] == 'T' || ch[i] == 'U' || ch[i] == 'V') {
                needTime = needTime + 9;
            } else if (ch[i] == 'W' || ch[i] == 'X' || ch[i] == 'Y' || ch[i] == 'Z') {
                needTime = needTime + 10;
            }
        }
        System.out.println(needTime);
    }
}
