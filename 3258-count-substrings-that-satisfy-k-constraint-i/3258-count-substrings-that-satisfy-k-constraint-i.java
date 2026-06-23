class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int st=0;
        int zero=0;
        int ones=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                zero++;
            }
            else{
                ones++;
            }
            while(zero>k&&ones>k)
        {
            if(s.charAt(st)=='0')
            {
                zero--;
            }
            else{
                ones--;
            }
            st++;
        }
        ans+=i-st+1;
        }
        return ans;
    }
}