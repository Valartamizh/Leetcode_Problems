class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int low = 0;
        int res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                low = i+1;
            }else{
                res = Math.max(res, i-low+1);
            }
        }
        return res;
    }
}