import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int N=0, start = 0, length = 0;
        char[] ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null ){
            N = Integer.parseInt(str);
            ch = new char[(int)Math.pow(3,N)];
            length = ch.length;

            for(int i=0;i<ch.length;i++){
                ch[i] ='-';
            }
            MergeSort(ch,start,length);
            bw.write(ch);
            bw.newLine();
            bw.flush();
        }

    }
    static void MergeSort(char[] ch, int start, int end) {
        int div = (end-start) / 3;
        if(div < 1) return;
        int mid_start = start + div, mid_end = end - div;
        do{
            ch[mid_start] = ' ';
            mid_start++;
        }while(mid_start < mid_end);
        mid_start = start + div;
        mid_end = end - div;

        MergeSort(ch,start,mid_start);
        MergeSort(ch,mid_end,end);
    }
}

