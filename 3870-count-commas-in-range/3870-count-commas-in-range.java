class Solution {
    public int countCommas(int n) {
        int o=Integer.toString(n).length();
        int k =0;
        if(o<=3) return 0;
        for(int i=1000;i<=n;i++){
            k++;
        }
        return k;
    }
}