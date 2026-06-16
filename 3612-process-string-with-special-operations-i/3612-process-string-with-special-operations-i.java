class Solution {
    public String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '*':
                    if (str.length() > 0) {
                        str.deleteCharAt(str.length() - 1);
                    }
                    break;
                case '#':
                    str.append(str.toString());
                    break;
                case '%':
                    str.reverse();
                    break;
                default:
                    str.append(ch);
                    break;
            }
        }
        return str.toString();
    }
}
