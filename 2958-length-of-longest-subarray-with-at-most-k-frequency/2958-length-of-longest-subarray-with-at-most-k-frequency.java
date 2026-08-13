class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int N = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        int ll = 0;
        int rr = 0;
        int result = 0;
        while (rr < N) {
            int num = nums[rr++];
            int cnt = map.getOrDefault(num, 0);
            if ( cnt < k ) {
                map.put(num, cnt+1);
            } else {
                int num2 = 0;
                while ( (num2 = nums[ll++]) != num )
                    map.put(num2, map.get(num2)-1);
            }
            result = Math.max(result, rr - ll);
        }
        return result;
    }
}