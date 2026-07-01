class Solution {
    public String reverseVowels(String s) {
        // String str = "";
        StringBuilder str = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                arr.add(c);
        }
        Collections.reverse(arr);
        int j=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                str.append(arr.get(j));
                j++;}
            else str.append(c);
        }
        System.out.print(str);
        return str.toString();
    }
}