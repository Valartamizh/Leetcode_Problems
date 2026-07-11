class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int offset = 1000;

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();

        boolean[] lookup1 = new boolean[2001];
        boolean[] lookup2 = new boolean[2001];

        for (int val : nums1) {
            lookup1[offset + val] = true;
        }

        for (int val : nums2) {
            if (!lookup1[offset + val]) {
                res2.add(val);
                lookup1[offset + val] = true;
            }
            lookup2[offset + val] = true;
        }

        for (int val : nums1) {
            if (!lookup2[offset + val]) {
                res1.add(val);
                lookup2[offset + val] = true;
            }
            lookup1[offset + val] = true;
        }

        return Arrays.asList(res1, res2);
    }
}