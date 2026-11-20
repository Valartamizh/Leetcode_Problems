class Solution {
    public boolean detectCapitalUse(String word) {
        if(checkString1(word) || checkString2(word) || checkString3(word)){
            return true;
        }
        return false;
    }
    public static boolean checkString1(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isUpperCase(ch)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkString2(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isLowerCase(ch)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkString3(String str){
        if(Character.isUpperCase(str.charAt(0))){
            for(int i=1; i<str.length(); i++){
                if(!Character.isLowerCase(str.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}