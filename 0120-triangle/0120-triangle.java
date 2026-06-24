class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int below = triangle.get(i+1).get(j);
                int belowRight = triangle.get(i+1).get(j+1);
                int updated = triangle.get(i).get(j) + Math.min(below, belowRight);
                triangle.get(i).set(j, updated);
            }
        }
        return triangle.get(0).get(0);
    }
}
