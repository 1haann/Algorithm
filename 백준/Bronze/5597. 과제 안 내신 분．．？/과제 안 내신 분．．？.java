import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] students = new int[28];
        for (int i = 0; i < 28; i++) {
            students[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(students);
        int call = 1;
        int num = 0;
        int uglyStudent = 0;

        //오름차순 정렬 후 제출한 28명의 학생을 전부 확인하거나 제출 안 한 학생 2명을 찾을 때까지 반복
        while (uglyStudent < 2 && num < 28) {
            if (students[num] == call) {
                num++;
                call++;
            } else {    // students[num] != count
                sb.append(call + "\n");
                uglyStudent++;
                call++;
            }
        }
        // case1 : uglyStudent == 0로 while문에서 미제출자를 한명도 찾지 못한 경우 29번,30번이 미제출
        if (uglyStudent == 0) {
            sb.append(29 + "\n");
            sb.append(30 + "\n");
        }
        // case2 : uglyStudent == 1로 while문에서 미제출자를 한명을 찾은 경우 30번이 미제출
        if (uglyStudent == 1) {
            sb.append(30 + "\n");
        }
        // case3 : uglyStudent == 2로 whille문에서 미제출자 2명을 모두 찾은경우 그대로 출력
        
        System.out.println(sb);
    }
}

//3
//1
//4
//5
//7
//9
//6
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//22
//23
//24
//25
//26
//27
//28
//2
//29