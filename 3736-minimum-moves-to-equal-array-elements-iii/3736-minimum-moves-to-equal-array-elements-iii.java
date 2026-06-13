class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num > max) max = num;
        }
        for(int num : nums) sum += max-num;
        return sum;
    }
}