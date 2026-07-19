class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        HashSet<Character> seen = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            freq.put(c, freq.get(c) - 1);
            if (seen.contains(c))
                continue;

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && freq.get(stack.peek()) > 0) {

                seen.remove(stack.pop());
            }

            stack.push(c);
            seen.add(c);
        }

        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}