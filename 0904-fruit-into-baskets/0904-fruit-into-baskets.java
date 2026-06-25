class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int res = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int right = 0;right<fruits.length;right++){
            mp.merge(fruits[right],1,Integer::sum);

            while(mp.size() > 2){
                mp.merge(fruits[left],-1,Integer::sum);
                mp.remove(fruits[left], 0);
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}