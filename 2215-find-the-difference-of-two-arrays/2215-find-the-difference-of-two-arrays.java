class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>(nums1.length + nums2.length);
        HashSet<Integer> hs2 = new HashSet<>(nums1.length + nums2.length);

        HashSet<Integer> intersect = new HashSet<>(nums1.length + nums2.length);
        
        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs1.contains(nums2[i])) intersect.add(nums2[i]);
            else hs2.add(nums2[i]);
        }

        for (Integer i : intersect) {
            hs1.remove(i); 
        }
        
        
        list.add(new ArrayList<>(hs1));
        list.add(new ArrayList<>(hs2));

        return list;
    }
}