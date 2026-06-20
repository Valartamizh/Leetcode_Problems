class Solution {
    public String defangIPaddr(String address) {
        String str = "";
        for(char ch:address.toCharArray()){
            if(ch == '.'){
                str+="[.]";
            }else{
                str+=Character.toString(ch);
            }
        }
        return str;
    }
}