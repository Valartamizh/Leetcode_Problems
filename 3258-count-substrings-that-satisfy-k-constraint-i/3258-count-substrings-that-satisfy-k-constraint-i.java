class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int zero=0, one = 0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j) == '0'){
                    zero++;
                }
                else one++;

                if(one <= k || zero<= k) ans++;
            }
            
        }
        return ans;
    }
}