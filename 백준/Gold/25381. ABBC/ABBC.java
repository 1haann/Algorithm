import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();

        int cnt = 0;
        int Aflag = 0, Bflag = 0, Cflag = 0;

        while(Cflag < ch.length) { // C를 찾는 과정
            if(ch[Cflag] == 'C'){
                while(Bflag < Cflag) {  // 찾은 C 이전에 나온 B를 찾는 과정
                    if(ch[Bflag] == 'B'){
                        cnt++;
                        ch[Cflag] = ' ';
                        ch[Bflag] = ' ';
                        break;
                    }
                    Bflag++;
                }
            }
            Cflag++;
        }

        Bflag = 0;
        while(Bflag < ch.length){
            if(ch[Bflag] == 'B'){
                while(Aflag < Bflag) {
                    if(ch[Aflag] == 'A'){
                        cnt++;
                        ch[Bflag] = ' ';
                        ch[Aflag] = ' ';
                        break;
                    }
                    Aflag++;
                }
            }
            Bflag++;
        }
        System.out.println(cnt);
    }
}
//BABCAB
//BAABBC
//BBACBC



