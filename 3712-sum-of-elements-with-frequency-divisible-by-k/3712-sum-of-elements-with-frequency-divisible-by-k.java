class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int n=nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt % k == 0){
                ans += nums[i];
            }
        }
        return ans;
    }
}