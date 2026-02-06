class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int curArea = 0;
        while(left < right){
            curArea = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(curArea, max);
            if(height[left] > height[right]) right--;
            else left++ ;
        }
        return max;
    }
}