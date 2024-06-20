import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        double totalMyScore = 0.0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch (grade) {
                case "A+":
                    sum +=score * 4.5;
                    totalMyScore += score;
                    break;
                case "A0":
                    sum +=score * 4.0;
                    totalMyScore += score;
                    break;
                case "B+":
                    sum +=score * 3.5;
                    totalMyScore += score;
                    break;
                case "B0":
                    sum +=score * 3.0;
                    totalMyScore += score;
                    break;
                case "C+":
                    sum +=score * 2.5;
                    totalMyScore += score;
                    break;
                case "C0":
                    sum +=score * 2.0;
                    totalMyScore += score;
                    break;
                case "D+":
                    sum +=score * 1.5;
                    totalMyScore += score;
                    break;
                case "D0":
                    sum +=score * 1.0;
                    totalMyScore += score;
                    break;
                case "F":
                    sum +=score * 0.0;
                    totalMyScore += score;
                    break;
                default:
            }
        }
        if (sum == 0.0) {
            System.out.printf("%6f", sum);
        }
        else {
            System.out.printf("%6f", sum / totalMyScore);
        }
    }
}
