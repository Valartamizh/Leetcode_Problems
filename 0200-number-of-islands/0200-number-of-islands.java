class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island = 0;
        boolean visited[][] = new boolean[row][col];
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    island++;

                    Queue<int[]> que = new LinkedList<>();
                    que.offer(new int[]{i, j});
                    visited[i][j] = true;

                    while(!que.isEmpty()){
                        int[] curr = que.poll();
                        int r = curr[0];
                        int c = curr[1];
                        for(int[] d : dir){
                            int nr = r + d[0];
                            int nc = c + d[1];
                            if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc] == '1' && !visited[nr][nc]){
                                que.offer(new int[]{nr,nc});
                                visited[nr][nc] = true;
                            }
                        }
                    }
                }
            }
        }
        return island;
    }
}