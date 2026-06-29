class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int co = 0;
        for(String  str : patterns){
            if(word.contains(str)) co++;
        }
        return co;
    }
}