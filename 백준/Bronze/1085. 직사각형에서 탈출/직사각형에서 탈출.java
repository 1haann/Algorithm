import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000;
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][] vertex = new int[][]{{0,0},{0,h},{w,0},{w,h}};
        for(int i=0,x_distance=0,y_distance=0,coordinate=0;i<vertex.length;i++){
                x_distance = Math.abs(vertex[i][0] - x);
                y_distance = Math.abs(vertex[i][1] - y);
                coordinate =  x_distance > y_distance  ? y_distance : x_distance;
                if(min > coordinate)
                    min = coordinate;
        }
        System.out.println(min);
    }
}