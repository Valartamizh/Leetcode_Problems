class Solution {
    public boolean hasSameDigits(String s) 
    {
        char arr[]=s.toCharArray();
        int n=s.length();
        while(n!=2)
        {
            for(int i=1;i<n;i++)
            {
                int ch1=arr[i-1]-'0';
                int ch2=arr[i]-'0';
                int sum=(ch1+ch2);
                arr[i-1]=(char)(sum%10+'0');
            }
            n--;
        }
        if(arr[0]==arr[1])
        {
            return true;
        }
        return false;
    }
}