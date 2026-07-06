class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int zero = 0;
        int res = Integer.MIN_VALUE;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero > k){
                if(nums[low] == 0){
                    zero--;
                }
                low++;
            }
            res = Math.max(res, i-low+1);
        }
        return res;
    }
}