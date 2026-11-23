class Solution {
    public int mostWordsFound(String[] sentences) {
        //ArrayList<String> str = new ArrayList<>();
        int max = 0;
        for(String st : sentences){
            int c = 0;
            String[] t = st.split(" ");
            for(String u : t){
                c++;
            }
            max = Math.max(c, max);            
        }
        return max;
    }
}