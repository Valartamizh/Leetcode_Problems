class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] str = title.split(" ");
        String res = "";
        for(String s : str){
            if(s.length()> 2){
                res += s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
            }
            else res += s;
            res+=" ";
        }
        return res.trim();

    }
}