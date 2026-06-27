class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.size();i++){
            String s = Integer.toBinaryString(i);
            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    count++;
                }
            }
            if(count == k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}