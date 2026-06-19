class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i=1;i<=gain.length;i++){
            arr.add(arr.get(i-1)+gain[i-1]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            max = Math.max(max, arr.get(i));
        }
        return max;
    }
}