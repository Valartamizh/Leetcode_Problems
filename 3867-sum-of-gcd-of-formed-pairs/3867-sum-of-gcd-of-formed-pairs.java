class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        long sum = 0;
        int max[] = new int[nums.length];
        int m = 0;
        for(int i=0;i<nums.length;i++){
            m = Math.max(nums[i], m);
            max[i] = m;
        }
        int pre[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pre[i] = gcd(nums[i], max[i]);
        }
        Arrays.sort(pre);
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            sum+=gcd(pre[low],pre[high]);
            low++;
            high--;
        }
        return sum;
    }
}
