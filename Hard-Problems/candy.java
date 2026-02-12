class Solution {
    public int candy(int[] ratings) {
        int[] allo = new int[ratings.length];
        Arrays.fill(allo,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1] < ratings[i]){
                allo[i] = allo[i-1] + 1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i+1] < ratings[i]){
                allo[i] = Math.max(allo[i], allo[i+1] + 1);
            }
        }
        int sum = 0;
        for(int i=0;i<allo.length;i++){
            sum+=allo[i];
        }
        return sum;
    }
}
