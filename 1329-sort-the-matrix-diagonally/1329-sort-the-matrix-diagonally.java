class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int temp = 0;
        boolean hasChanged = true;
        while(hasChanged){
            hasChanged = false; 
            for(int i = 1; i < mat.length; i++){
                for (int j = mat[0].length-1; j > 0; j--){
                    if(mat[i][j] < mat[i-1][j-1]){
                        hasChanged = true;
                        temp = mat[i][j];
                        mat[i][j] = mat[i-1][j-1];
                        mat[i-1][j-1] = temp;
                    }
                }
            }
        }
        return mat;
    }
}