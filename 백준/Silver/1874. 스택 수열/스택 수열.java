import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int i;

        for(i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        i = 0;
        int num = 1;
        int idx = 0;
        String[] result = new String[n*2];
        boolean isPossible = true;
        while(i<n && num <= n) {
            if(!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
                result[idx] = "-";
                idx++;
                i++;
            }
            else {
                stack.push(num);
                result[idx] = "+";
                idx++;
                num++;
            }
        }
        while(!stack.isEmpty()) {
            if(arr[i] == stack.pop()){
                result[idx] = "-";
                idx++;
                i++;
            }
            else {
                System.out.println("NO");
                isPossible = false;
                break;
            }
        }
        if(isPossible == true) {
            for(String s : result) {
                System.out.println(s);
            }
        }
    }
}