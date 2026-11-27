class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);

            if (isVowel(first) && isVowel(last)) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}