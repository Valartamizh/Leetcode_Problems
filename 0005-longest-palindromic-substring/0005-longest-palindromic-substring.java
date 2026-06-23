class Solution {
    public String longestPalindrome(String s) {
        String palindrome="";
        for(int i = 0 ; i < s.length();i++){
            for(int j =i; j< s.length() ; j++){
                String substr = s.substring(i , j+1);
                boolean isPalindrome = true;
                int left = 0 ;
                int right = substr.length()-1;
                while(left < right){
                    if(substr.charAt(left)!=substr.charAt(right)){
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(isPalindrome && substr.length() > palindrome.length()){
                    palindrome = substr;
                }
            }
        }
        return palindrome;
    }
}