class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        while(s.length()>2){
            String st = "";
            int i = 1;
            while(i<s.length()){          
                int num1 = Integer.parseInt(Character.toString(s.charAt(i-1)));
                int num2 = Integer.parseInt(Character.toString(s.charAt(i)));
                st+=(num1+num2)%10;
                i++;
            }
            s=st;
        }        
        return s.charAt(0) == s.charAt(1);
    }
}