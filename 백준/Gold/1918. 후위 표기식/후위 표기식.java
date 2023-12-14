import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int priority(char ch){
        if(ch == '(') return 0;
        if(ch == '-' || ch == '+') return 1;
        else return 2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] ch = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<ch.length;i++) {

            if(ch[i] >='A' && ch[i] <= 'Z')   // 피연산자는 바로 출력
                System.out.print(ch[i]);

            else if(ch[i] == '(' || stack.isEmpty()) { // 스택이 비어 있거나 '('가 들어온 경우 스택에 바로 삽입
                stack.push(ch[i]);
            }
            else if (ch[i] == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') { // '('가 나올때까지 pop 반복
                    System.out.print(stack.pop());
                }
                stack.pop();    // '(' 제거
            }
            else {
                if(priority(ch[i]) > priority(stack.peek())) {  // 새로 비교하는 값의 우선순위가 스택에 있는 값의 우선순위보다 높은 경우
                    stack.push(ch[i]);  // 스택에 해당 값 삽입
                }
                else {  // 스택에 있는 값의 우선순위가 새로 비교하는 값의 우선순위보다 높거나 같은 경우
                        //priority(ch[i]) <= priority(stack.peek()
                    while(!stack.isEmpty() && priority(ch[i]) <= priority(stack.peek())) { // 비교하는 값보다 우선순위가 낮은 값을 찾을 때까지 꺼냄
                        System.out.print(stack.pop());
                    }
                    stack.push(ch[i]);
                }
            }
        }

        while(stack.isEmpty() == false) {
            System.out.print(stack.pop());
        }
    }
}
