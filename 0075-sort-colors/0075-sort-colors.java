class Solution {
    public void sortColors(int[] nums) {
        for(int pass = 0; pass < nums.length - 1; pass++) {
            for(int i = 1; i < nums.length; i++) {
                if(nums[i - 1] > nums[i]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}