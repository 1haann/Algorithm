import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //ArrayList<Integer> list = new ArrayList<>();
        int[] list = new int[N+1];
        int cnt = 1,idx = 1,i = 1,x = 0,max_idx = 0;
        while(cnt<=N){
            x = Integer.parseInt(br.readLine());
            if(x == 0){ // 가장 큰 값 출력,삭제
                if(idx == 1){   // 비어있는 상태
                    System.out.println(0);
                }
                else{          // 비어있지 않은 상태
                    System.out.println(list[1]);
                    list[1] = -1;   // 루트노드에 있는 최대값 삭제
                    idx = idx - 1;  // idx : 새 노드가 들어갈 자리
                    list[1] = list[idx];  //마지막 노드를 루트노드로 가져옴
                    list[idx] = -1;
                    i = 1;
                    while(i<=idx/2){   // downheap
                        if(list[i*2] > list[i*2+1]){ //왼쪽 노드와 오른쪽 노드 중 더 큰 값 찾기
                            max_idx = i*2;
                        }
                        else{
                            max_idx = i*2+1;
                        }
                        if(list[i] > list[max_idx]){
                            break;
                        }
                        else{
                            int max_temp = list[max_idx];
                            list[max_idx] = list[i];
                            list[i] = max_temp;
                            i = max_idx;
                        }
                    }
                }
            }
            else {  // x!=0 (x를 추가하는 과정)
                list[idx] = x;
                int idx_temp = idx;
                while(idx_temp > 1){    // upheap
                    if(list[idx_temp] > list[idx_temp/2]){
                        list[idx_temp] = list[idx_temp/2];
                        list[idx_temp/2] = x;
                        idx_temp /= 2;
                    }
                    else{
                        break;
                    }
                }
                idx++;
            }
            cnt++;
        }
    }
}