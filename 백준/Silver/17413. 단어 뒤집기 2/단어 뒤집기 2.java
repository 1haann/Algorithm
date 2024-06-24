import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        // 태그 관련 알파벳인지, 단어 관련 알파벳인지 구분! 알파벳이 들어왔을 때 스택의 최상단 값이 <인 경우 태그 관련, 아닌 경우는 단어 관련
        // 단어는 공백으로 구분하여 뒤집으며 태그 내부의 공백은 무시한다.
        // case 1 : 태그 관련 알파벳이 들어온 경우 그대로 출력한다.
        // case 2 : 태그 <의 경우 스택에 들어있는 값들을 모두 꺼내 출력한다. 이후 <도 스택에 넣고 출력한다.
        // case 3 : 태그 >의 경우 출력하고 pop()으로 스택에서 <를 제거한다.
        // case 4 : 공백이 들어온 경우 태그 안의 공백인지, 단어를 구분하는 공백인지 확인한다.
        // case 5 : 단어가 들어온 경우는 스택에 넣기

        for (int j = 0; j < input.length(); j++) {
            if (!stack.isEmpty() && stack.peek() == '<') {  // 태그 관련 알파벳인 경우, case 1 or case 3 or case 4
                if (input.charAt(j) == '>') {   // case 3
                    sb.append(input.charAt(j));
                    stack.pop();
                } else {                        // case 1
                    sb.append(input.charAt(j));
                }
            } else if (input.charAt(j) == '<') {    // case 2
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                stack.push(input.charAt(j));
                sb.append(input.charAt(j));
            } else if (input.charAt(j) == ' ') {    // 공백이 들어온 경우 태그 안의 공백인지 아닌지 확인, case 4
                if (!stack.isEmpty() && stack.peek() == '<') { // 태그 안의 공백인 경우
                    sb.append(input.charAt(j));
                } else {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
            } else {
                stack.push(input.charAt(j));
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
