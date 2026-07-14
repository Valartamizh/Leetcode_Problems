class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = (int)Math.pow(2, nums.length);
        for(int i = 0; i < n; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if((i & (1 << j)) != 0){
                    arr.add(nums[j]);
                }
            }
            res.add(arr);
        }
        return res;
    }
}