class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        if(word.length() < 8) return word.length();
        for(int i = 0; i < word.length(); i++)
            ans += (i / 8) + 1;
        return ans;
    }
}