class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> en : mp.entrySet()){
            int val = en.getKey();
            int cont = en.getValue();

            if(cont%k == 0) sum+= val*cont;
        }
        return sum;
    }
}