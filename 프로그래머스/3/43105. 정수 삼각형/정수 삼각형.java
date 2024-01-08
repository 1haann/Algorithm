class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][];
        
        for(int i=0;i<n;i++) {
            dp[i] = new int[i+1];
        }
        for(int j=0;j<n;j++) {
            dp[n-1][j] = triangle[n-1][j];
        }
        
        for(int i=n-2;i>=0;i--) {
            for(int j=0;j<triangle[i].length;j++){
                dp[i][j] = Math.max(dp[i+1][j],dp[i+1][j+1]) + triangle[i][j];
            }
            
        }
        return dp[0][0];
    }
}