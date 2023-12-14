import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int[] result = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            }
            else if(arr[stack.peek()] > arr[i]) { // 스택에 있는 arr[i] 이전의 값이 arr[i]의 값보다 더 큰 경우 해당 인덱스 저장
                stack.push(i);
            }
            else { // arr[stack.peek()] < arr[i] , arr[stack.peek()]의 값이 arr[i]의 값보다 작은 경우
                while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) { // 조건 만족 시 arr[i]는 스택의 값보다 크며 가장 왼쪽에 있는 수
                    result[stack.pop()] = arr[i];
                }
                stack.push(i);
            }
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb);

    }
}


//7
//
//        4 3 2 1 2 3 4
//
//        ans : -1 4 3 2 3 4 -1
//
//        out : -1 -1 -1 3 4 4 -1