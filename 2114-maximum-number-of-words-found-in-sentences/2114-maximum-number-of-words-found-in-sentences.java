class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            String[] arr = sentences[i].split(" ");
            int len = arr.length;
            max = Math.max(max,len);
        }
        return max;
    }
}