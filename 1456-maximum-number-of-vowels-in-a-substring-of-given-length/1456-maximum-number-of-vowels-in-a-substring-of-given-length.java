class Solution {
    public int maxVowels(String s, int k) {
        String v = "aeiou";
        int max = 0;
        int cont = 0;
        for(int i=0;i<k;i++){
            if(v.contains(Character.toString(s.charAt(i)))){
                cont++;
            }
        }
        max = cont;
        for(int i=k;i<s.length();i++){
            if(v.contains(Character.toString(s.charAt(i)))) cont++;
            if(v.contains(Character.toString(s.charAt(i-k)))) cont--;
            max = Math.max(max, cont);
        }
        return max;
    }
}