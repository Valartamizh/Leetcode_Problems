class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cont = 0;
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            if(nums[low] + nums[high] == k){
                cont++;
                low++;
                high--;
            }
            else if(nums[low]+nums[high] < k) low++;
            else high--;
            //else break;
        }
        return cont;
    }
}