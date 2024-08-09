import java.io.*;
import java.util.*;
class Main {
	static int[][] dp;
	// static boolean[][] dpFlag;
	static int K;
	static final int MOD = 100_000_007;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		dp = new int[N + M + 1][K + 1];
		
		for(int[] row : dp){
			Arrays.fill(row, -1);
		}
 		// dpFlag = new boolean[N + M + 1][K + 1];
		sb.append(recursive(N,M,0));
		System.out.println(sb);
	}
	
	public static int recursive(int myMarble,int yourMarble,int round){
		if(myMarble == 0 || yourMarble == 0){
			// dp[myMarble][round] = 1;
			// dpFlag[myMarble][round] = true;
			return 1;
		}
		if(round >= K) {
			// dpFlag[myMarble][round] = true;
			return 0;
		}
		// if(dpFlag[myMarble][round] == true) {
		// 	return dp[myMarble][round];
		// }
		if(dp[myMarble][round] != -1) {
			return dp[myMarble][round];
		}
		int result = 0;
		result = result + recursive(myMarble - 1,yourMarble + 1,round + 1);
		result = result + recursive(myMarble + 1,yourMarble - 1,round + 1);
		result = result + recursive(myMarble,yourMarble,round + 1);
		result = result % MOD;
		dp[myMarble][round] = result;
		return result;
	}
}
