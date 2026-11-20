class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                caps++;
            }
        }
        return caps == word.length() || caps == 0 || (caps == 1 && Character.isUpperCase(word.charAt(0)));
    }
}