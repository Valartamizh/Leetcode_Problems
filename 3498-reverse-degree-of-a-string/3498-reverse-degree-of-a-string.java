class Solution {
    public int reverseDegree(String s) {
        int sum=0,product=1,num=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int value='z'-ch+1;
            num=value*product;
            sum=sum+num;
            product++;
        }
        return sum;
        
    }
}