class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
     int max = 0;
        for(int num : nums) {
            max = Math.max(max, num);
        }

        int[] freq = new int[max+1];
        for(int num : nums)
            freq[num]++;

        int windowSum = 0;
        int maxFreq = 0;

        int rightBound = Math.min(max, k);
        for(int i=0;i<=rightBound;i++)
            windowSum += freq[i];
        
        for(int target = 0;target <= max; target++) {

            int countAtTarget = freq[target];

            int possible = Math.min(windowSum, countAtTarget + numOperations);
            maxFreq = Math.max(maxFreq , possible);

            int left = target - k;
            if(left >= 0)
                windowSum -= freq[left];

            int right = target + 1 + k;
            if(right <= max)
                windowSum += freq[right];
        }

        return maxFreq;
    }
}