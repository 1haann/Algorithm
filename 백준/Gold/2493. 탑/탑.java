import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int[] tower = new int[N];
        
        for(int i=0;i<N;i++) {
            tower[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i < N; i++) {
            if(i == 0) {
                System.out.print(0 + " ");
                stack.push(i);   // 탑의 높이가 아니라 해당 인덱스 값을 저장 (값과 인덱스 둘 다 접근이 필요하기 때문)
                continue;
            }
            if(tower[stack.peek()] < tower[i]) {  //스택의 top 값보다 타워의 높이가 더 큰 경우
                do{
                    stack.pop();
                }while(stack.size() != 0 && tower[stack.peek()] < tower[i]);

                if(stack.isEmpty() == true) {
                    System.out.print(0 + " ");
                }
                else {  // stack.isEmpty() == false
                    System.out.print(stack.peek() + 1 + " ");
                }
                stack.push(i);
            }
            else if(tower[stack.peek()] > tower[i]) {
                System.out.print(stack.peek() + 1 + " ");
                stack.push(i);
            }
        }
    }
}
