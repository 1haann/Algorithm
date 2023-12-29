import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int i,j,k;
        
        for(int cnt=0;cnt<commands.length;cnt++) {
            i = commands[cnt][0] - 1;
            j = commands[cnt][1] - 1;
            k = commands[cnt][2] - 1;

            int[] tmp = new int[j - i + 1];
            for(int cnt2=i,idx=0;cnt2<=j;cnt2++,idx++) {
                tmp[idx] = array[cnt2];
            }
            Arrays.sort(tmp);
            result[cnt] = tmp[k];
        }
        return result;
    }
}