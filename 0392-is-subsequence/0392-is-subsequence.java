class Solution {
    public boolean isSubsequence(String s, String t) {
        int low = 0;
        int high = 0;
        int co = 0;
        while(t.length() > s.length() && low < s.length() && high < t.length()){
            if(s.charAt(low) == t.charAt(high)){
                low++;
                high++;
                co++;
            }else high++;
        }
        if(co == s.length()) return true;
        return false;
    }
}