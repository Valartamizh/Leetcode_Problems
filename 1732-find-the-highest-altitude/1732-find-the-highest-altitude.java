class Solution {
    public int largestAltitude(int[] arr) {
        int[] prefix = new int[arr.length+1];
        prefix[0] = 0;
        for(int i=1;i<=arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i-1];
        }      
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            max = Math.max(max, prefix[i]);
        }
        return max;
    }
}