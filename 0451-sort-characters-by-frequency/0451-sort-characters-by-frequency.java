class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        StringBuilder res = new StringBuilder();

        while (!mp.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            for (Map.Entry<Character, Integer> en : mp.entrySet()) {
                if (en.getValue() > maxFreq) {
                    maxFreq = en.getValue();
                    maxChar = en.getKey();
                }
            }

            for (int i = 0; i < maxFreq; i++) {
                res.append(maxChar);
            }

            mp.remove(maxChar);
        }

        return res.toString();
    }
}