class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];              
        for (int x : arr) freq[x + 1000]++;

        boolean[] seen = new boolean[arr.length + 1];   
        for (int c : freq) {
            if (c == 0) continue;                 
            if (seen[c]) return false;            
            seen[c] = true;
        }
        return true;
    }
}