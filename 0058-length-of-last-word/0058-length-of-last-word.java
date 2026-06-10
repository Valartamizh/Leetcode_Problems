class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int temp=0;
        for(String ch:arr){
            temp=ch.length();
        }
        return temp;
    }
}