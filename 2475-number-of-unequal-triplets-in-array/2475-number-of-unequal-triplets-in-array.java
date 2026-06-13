class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        int a = 0;

        for (int b : map.values()) {
            int c = n - a - b;
            ans += a * b * c;
            a += b;
        }

        return ans;
        
    }
}