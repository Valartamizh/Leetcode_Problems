class Solution {
    public int maxVowels(String s, int k) {
        String v = "aeiou";
        int max = 0;
        int cont = 0;
        for(int i=0;i<k;i++){
            if(v.indexOf(s.charAt(i)) != -1){
                cont++;
            }
        }
        max = cont;
        for(int i=k;i<s.length();i++){
            if(v.indexOf(s.charAt(i)) != -1) cont++;
            if(v.indexOf(s.charAt(i-k)) != -1) cont--;
            max = Math.max(max, cont);
        }
        return max;
    }
}