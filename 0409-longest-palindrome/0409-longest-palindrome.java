class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for(int count : mp.values()){
            length += (count / 2) * 2;
            if(count % 2 == 1){
                oddFound = true;
            }
        }
        if(oddFound) length += 1;
        return length;
    }
}
