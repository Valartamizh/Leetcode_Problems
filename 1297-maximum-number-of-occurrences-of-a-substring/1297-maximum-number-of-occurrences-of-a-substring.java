class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> chars = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            chars.put(c, chars.getOrDefault(c, 0) + 1);

            if (right - left + 1 > minSize) {
                char ch = s.charAt(left);
                chars.put(ch, chars.get(ch) - 1);
                if (chars.get(ch) == 0)
                    chars.remove(ch);
                left++;
            }

            if (right - left + 1 == minSize && chars.size() <= maxLetters) {
                String sub = s.substring(left, right + 1);
                int count = freq.getOrDefault(sub, 0) + 1;
                freq.put(sub, count);
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }
}