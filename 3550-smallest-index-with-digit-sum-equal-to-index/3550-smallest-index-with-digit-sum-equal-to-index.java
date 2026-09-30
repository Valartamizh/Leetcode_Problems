class Solution {
    public int sum(int a){
        int s = 0;
        while(a!=0){
            int temp = a%10;
            s+=temp;
            a/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i == sum(nums[i])){
                return i;
            }
        }
        return -1;
    }
}