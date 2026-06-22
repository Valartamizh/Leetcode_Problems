class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        Map<Character, Integer> mp = new TreeMap<>();

        for (char ch : text.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (ch == 'a') {
                ans = Math.min(ans, freq);
            }
            if (ch == 'b' && ans != Integer.MAX_VALUE) {
                ans = Math.min(ans, freq);
            }
            if (ch == 'l' && ans != Integer.MAX_VALUE) {
                ans = Math.min(ans, freq / 2);
            }
            if (ch == 'n' && ans != Integer.MAX_VALUE) {
                ans = Math.min(ans, freq);
            }
            if (ch == 'o' && ans != Integer.MAX_VALUE) {
                ans = Math.min(ans, freq / 2);
            }
        }

        return ans != Integer.MAX_VALUE ? ans : 0;
    }
}