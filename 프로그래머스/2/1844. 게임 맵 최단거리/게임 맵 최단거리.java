import java.util.*;
class Solution {
    int[] dx = { 0, 1, 0, -1 };
    int[] dy = { -1, 0, 1, 0 };
    boolean[][] visited;
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        visited = new boolean[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        visited[0][0] = true;
        while(!q.isEmpty()){
            int[] node = q.poll();
            if(node[0] == n-1 && node[1] == m-1){
                return node[2];
            }
            
            for(int i = 0; i < 4; i++){
                int nx = node[0] + dx[i];
                int ny = node[1] + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        q.add(new int[]{nx, ny, node[2] + 1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }

}