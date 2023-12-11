import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for(String s : str) {
            int stack = 0;
            int flag = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(') {    //여는 괄호는 스택에 저장
                    stack++;
                }
                if(s.charAt(i) == ')') {    //닫는 괄호는 스택을 확인해서 여는 괄호가 있으면 소거, 없으면 NO출력 후 종료
                    if(stack == 0) {    // stack이 비어있는 경우 for문 종료
                        flag = 1; // 닫는 괄호 이전에 여는 괄호가 나온 적 없는 경우 종료하고 종료되었음을 확인하는 변수
                        break;
                    }
                    stack--;
                }
            }

            if(flag == 1){  // for문 도중 종료 되었을 경우
                System.out.println("NO");
            }
            if(flag == 0){  // for문을 끝까지 실행 (stack == 0 : empty , stack != 0 : not empty)
                if(stack == 0) {
                    System.out.println("YES");
                }
                if(stack != 0) {
                    System.out.println("NO");
                }
            }
        }
    }
}
