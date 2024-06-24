import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        int piece = 0;

        // case 1 : 여는 괄호는 스택에 저장 후 piece 1 증가
        // case 2 : 레이저()가 나온 경우에는 현재 스택의 사이즈만큼 piece 증가
        // case 3 : 닫는 괄호가 나온 경우 스택에서 pop()하여 스택 사이즈 감소

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') { // case 1 or case 2
                if (str.charAt(i + 1) == ')') { // case 2
                    piece = piece + stack.size();
                    i++;    // )괄호 위치 인덱스 통과
                } else {    // case 1
                    stack.push('(');
                    piece++;
                }
            } else { // case 3
                stack.pop();
            }
        }
        System.out.println(piece);
    }
}
