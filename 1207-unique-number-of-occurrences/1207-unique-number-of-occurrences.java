class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int a:arr){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        HashSet<Integer> set  = new HashSet<>(mp.values());
        return set.size() == mp.size();
    }
}
