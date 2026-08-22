class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n!=0){
            int temp = n%10;
            arr.add(temp);
            n/=10;
        }
        int sum = 0;
        int prod = 1;
        for(int i:arr){
            sum+=i;
            prod*=i;
        }
        int res = sum+prod;
        System.out.print(res);
        return (t%res==0 ? true:false);
    }
}