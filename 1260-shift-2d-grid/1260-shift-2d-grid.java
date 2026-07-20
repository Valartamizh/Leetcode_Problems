class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;

        

        for(int i=0;i<k;i++){
            int last = grid[n-1][m-1];
            for(int j=n-1;j>=0;j--){
                for(int l=m-1;l>=0;l--){
                    if (j == 0 && l == 0) {
                        grid[0][0] = last;
                    } else if (l == 0) {
                        grid[j][l] = grid[j - 1][m - 1];
                    } else {
                        grid[j][l] = grid[j][l - 1];
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            List<Integer> res = new ArrayList<>();
            for(int j=0;j<m;j++){
                res.add(grid[i][j]);
            }
            arr.add(res);
        }
        return arr;
    }
}