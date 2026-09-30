class Solution {
    public int reverseDegree(String s) {
        ArrayList<Integer> ind = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ind.add(i + 1);
            sum.add(26 - (c - 'a'));
        }
        int res = 0;
        for (int i = 0; i < ind.size(); i++) {
            res += ind.get(i) * sum.get(i);
        }
        return res;
    }
}